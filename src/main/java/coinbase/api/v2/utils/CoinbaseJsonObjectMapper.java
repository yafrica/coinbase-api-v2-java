package coinbase.api.v2.utils;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CoinbaseJsonObjectMapper {
    
    private static ObjectMapper COINBASE_MAPPER = new ObjectMapper();
    
    public <T> T fromString(String src, Class<T> classz) throws JsonParseException, JsonMappingException, IOException {
        return COINBASE_MAPPER.readValue(src, classz);
    }
    
    public <T> T dataFromString(String src, Class<T> classz) throws JsonParseException, JsonMappingException, IOException {
        JsonNode rootNode = COINBASE_MAPPER.readValue(src, JsonNode.class);
        JsonNode dataNode = rootNode.findPath("data");
        return COINBASE_MAPPER.treeToValue(dataNode, classz);
    }
    
    public <T> T fromInputStream(InputStream is, Class<T> classz) throws JsonParseException, JsonMappingException, IOException {
        return COINBASE_MAPPER.readValue(is, classz);
    }
    
    public <T> T dataFromInputStream(InputStream is, Class<T> classz) throws JsonParseException, JsonMappingException, IOException {
        JsonNode rootNode = COINBASE_MAPPER.readValue(is, JsonNode.class);
        JsonNode dataNode = rootNode.findPath("data");
        return COINBASE_MAPPER.treeToValue(dataNode, classz);
    }
    
    public String toJsonString(Object o) throws JsonProcessingException {
        return COINBASE_MAPPER.writeValueAsString(o);
    }
    
}
