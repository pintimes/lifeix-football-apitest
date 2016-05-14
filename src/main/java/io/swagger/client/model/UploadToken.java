package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * \u4E0A\u4F20\u6587\u4EF6\u4EE4\u724C
 **/

@ApiModel(description = "\u4E0A\u4F20\u6587\u4EF6\u4EE4\u724C")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class UploadToken   {
  
  private List<String> keys = new ArrayList<String>();
  private String token = null;

  
  /**
   * \u4E0A\u4F20\u6587\u4EF6\u540D\u5217\u8868
   **/
  public UploadToken keys(List<String> keys) {
    this.keys = keys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4E0A\u4F20\u6587\u4EF6\u540D\u5217\u8868")
  @JsonProperty("keys")
  public List<String> getKeys() {
    return keys;
  }
  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  
  /**
   * \u4EE4\u724C\u503C
   **/
  public UploadToken token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4EE4\u724C\u503C")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadToken uploadToken = (UploadToken) o;
    return Objects.equals(this.keys, uploadToken.keys) &&
        Objects.equals(this.token, uploadToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadToken {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

