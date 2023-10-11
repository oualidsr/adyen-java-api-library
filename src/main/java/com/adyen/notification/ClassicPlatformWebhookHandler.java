package com.adyen.notification;

import com.adyen.model.marketpaywebhooks.*;
import com.adyen.model.transferwebhooks.JSON;

import java.util.Optional;

public class ClassicPlatformWebhookHandler {
    private final String payload;

    public ClassicPlatformWebhookHandler(String payload) {
        this.payload = payload;
    }

    public Optional<AccountCreateNotification> getAccountCreateNotification() {
        return getOptionalField(AccountCreateNotification.class);
    }

    public Optional<AccountCloseNotification> getAccountCloseNotification() {
        return getOptionalField(AccountCloseNotification.class);
    }

    public Optional<AccountFundsBelowThresholdNotification> getAccountFundsBelowThresholdNotification() {
        return getOptionalField(AccountFundsBelowThresholdNotification.class);
    }

    public Optional<AccountHolderCreateNotification> getAccountHolderCreateNotification() {
        return getOptionalField(AccountHolderCreateNotification.class);
    }

    public Optional<AccountHolderPayoutNotification> getAccountHolderPayoutNotification() {
        return getOptionalField(AccountHolderPayoutNotification.class);
    }

    public Optional<AccountHolderStatusChangeNotification> getAccountHolderStatusChangeNotification() {
        return getOptionalField(AccountHolderStatusChangeNotification.class);
    }

    public Optional<AccountHolderUpcomingDeadlineNotification> getAccountHolderUpcomingDeadlineNotification() {
        return getOptionalField(AccountHolderUpcomingDeadlineNotification.class);
    }

    public Optional<AccountHolderUpdateNotification> getAccountHolderUpdateNotification() {
        return getOptionalField(AccountHolderUpdateNotification.class);
    }

    public Optional<AccountHolderVerificationNotification> getAccountHolderVerificationNotification() {
        return getOptionalField(AccountHolderVerificationNotification.class);
    }

    public Optional<AccountUpdateNotification> getAccountUpdateNotification() {
        return getOptionalField(AccountUpdateNotification.class);
    }

    public Optional<BeneficiarySetupNotification> getBeneficiarySetupNotification() {
        return getOptionalField(BeneficiarySetupNotification.class);
    }

    public Optional<CompensateNegativeBalanceNotification> getCompensateNegativeBalanceNotification() {
        return getOptionalField(CompensateNegativeBalanceNotification.class);
    }

    public Optional<DirectDebitInitiatedNotification> getDirectDebitInitiatedNotification() {
        return getOptionalField(DirectDebitInitiatedNotification.class);
    }

    public Optional<PaymentFailureNotification> getPaymentFailureNotification() {
        return getOptionalField(PaymentFailureNotification.class);
    }

    public Optional<RefundFundsTransferNotification> getRefundFundsTransferNotification() {
        return getOptionalField(RefundFundsTransferNotification.class);
    }

    public Optional<ReportAvailableNotification> getReportAvailableNotification() {
        return getOptionalField(ReportAvailableNotification.class);
    }

    public Optional<ScheduledRefundsNotification> getScheduledRefundsNotification() {
        return getOptionalField(ScheduledRefundsNotification.class);
    }

    public Optional<TransferFundsNotification> getTransferFundsNotification() {
        return getOptionalField(TransferFundsNotification.class);
    }

    private <T> Optional<T> getOptionalField(Class<T> clazz) {
        try {
            T val = JSON.getMapper().readValue(payload, clazz);
            return Optional.ofNullable(val);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
