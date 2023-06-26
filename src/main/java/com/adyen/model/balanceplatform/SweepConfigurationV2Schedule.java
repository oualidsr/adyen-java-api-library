/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.CronSweepSchedule;
import com.adyen.model.balanceplatform.SweepSchedule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;


@JsonDeserialize(using = SweepConfigurationV2Schedule.SweepConfigurationV2ScheduleDeserializer.class)
@JsonSerialize(using = SweepConfigurationV2Schedule.SweepConfigurationV2ScheduleSerializer.class)
public class SweepConfigurationV2Schedule extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SweepConfigurationV2Schedule.class.getName());

    public static class SweepConfigurationV2ScheduleSerializer extends StdSerializer<SweepConfigurationV2Schedule> {
        public SweepConfigurationV2ScheduleSerializer(Class<SweepConfigurationV2Schedule> t) {
            super(t);
        }

        public SweepConfigurationV2ScheduleSerializer() {
            this(null);
        }

        @Override
        public void serialize(SweepConfigurationV2Schedule value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SweepConfigurationV2ScheduleDeserializer extends StdDeserializer<SweepConfigurationV2Schedule> {
        public SweepConfigurationV2ScheduleDeserializer() {
            this(SweepConfigurationV2Schedule.class);
        }

        public SweepConfigurationV2ScheduleDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SweepConfigurationV2Schedule deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CronSweepSchedule
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CronSweepSchedule.class.equals(Integer.class) || CronSweepSchedule.class.equals(Long.class) || CronSweepSchedule.class.equals(Float.class) || CronSweepSchedule.class.equals(Double.class) || CronSweepSchedule.class.equals(Boolean.class) || CronSweepSchedule.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CronSweepSchedule.class.equals(Integer.class) || CronSweepSchedule.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CronSweepSchedule.class.equals(Float.class) || CronSweepSchedule.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CronSweepSchedule.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CronSweepSchedule.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(CronSweepSchedule.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing && typeMatch) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CronSweepSchedule.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CronSweepSchedule'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CronSweepSchedule'", e);
            }

            // deserialize SweepSchedule
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SweepSchedule.class.equals(Integer.class) || SweepSchedule.class.equals(Long.class) || SweepSchedule.class.equals(Float.class) || SweepSchedule.class.equals(Double.class) || SweepSchedule.class.equals(Boolean.class) || SweepSchedule.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SweepSchedule.class.equals(Integer.class) || SweepSchedule.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SweepSchedule.class.equals(Float.class) || SweepSchedule.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SweepSchedule.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SweepSchedule.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                // Checks if the unique type of the oneOf json matches any of the object TypeEnum values
                boolean typeMatch = Arrays.stream(SweepSchedule.TypeEnum.values()).anyMatch((t) -> t.getValue().contains(tree.findValue("type").asText()));
                if (attemptParsing && typeMatch) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SweepSchedule.class);
                    // typeMatch should enforce proper deserialization
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SweepSchedule'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SweepSchedule'", e);
            }

            // Throw error if there is no match
            if (match == 0) {
                throw new IOException(String.format("Failed deserialization for SweepConfigurationV2Schedule: %d classes match result, expected 1", match));
            }
            // Log warning if there is more than one match
            if (match > 1) {
                log.log(Level.WARNING, String.format("Warning, indecisive deserialization for SweepConfigurationV2Schedule: %d classes match result, expected 1", match));
            }

            SweepConfigurationV2Schedule ret = new SweepConfigurationV2Schedule();
            ret.setActualInstance(deserialized);
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public SweepConfigurationV2Schedule getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SweepConfigurationV2Schedule cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SweepConfigurationV2Schedule() {
        super("oneOf", Boolean.FALSE);
    }

    public SweepConfigurationV2Schedule(CronSweepSchedule o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SweepConfigurationV2Schedule(SweepSchedule o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CronSweepSchedule", new GenericType<CronSweepSchedule>() {
        });
        schemas.put("SweepSchedule", new GenericType<SweepSchedule>() {
        });
        JSON.registerDescendants(SweepConfigurationV2Schedule.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SweepConfigurationV2Schedule.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CronSweepSchedule, SweepSchedule
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CronSweepSchedule.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SweepSchedule.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CronSweepSchedule, SweepSchedule");
    }

    /**
     * Get the actual instance, which can be the following:
     * CronSweepSchedule, SweepSchedule
     *
     * @return The actual instance (CronSweepSchedule, SweepSchedule)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CronSweepSchedule`. If the actual instance is not `CronSweepSchedule`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CronSweepSchedule`
     * @throws ClassCastException if the instance is not `CronSweepSchedule`
     */
    public CronSweepSchedule getCronSweepSchedule() throws ClassCastException {
        return (CronSweepSchedule)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SweepSchedule`. If the actual instance is not `SweepSchedule`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SweepSchedule`
     * @throws ClassCastException if the instance is not `SweepSchedule`
     */
    public SweepSchedule getSweepSchedule() throws ClassCastException {
        return (SweepSchedule)super.getActualInstance();
    }

}

