package org.apache.dolphinscheduler.common.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicByte;

public class ByteSerializer extends JsonSerializer<BasicByte> {

    @Override
    public void serialize(BasicByte value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value", value.getJsonString());
    }
}