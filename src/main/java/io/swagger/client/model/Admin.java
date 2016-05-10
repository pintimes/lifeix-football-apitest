package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7BA1\u7406\u5458
 **/

@ApiModel(description = "\u7BA1\u7406\u5458")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T07:53:17.665Z")
public class Admin   {
  
  private String password = null;
  private String name = null;
  private String id = null;
  private String email = null;
  private String key = null;

  
  /**
   * \u52A0\u5BC6
   **/
  public Admin password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u52A0\u5BC6")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * \u540D\u79F0
   **/
  public Admin name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u540D\u79F0")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * id
   **/
  public Admin id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * \u5934\u50CF\u5730\u5740
   **/
  public Admin email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5934\u50CF\u5730\u5740")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * \u6388\u6743\uFF0C\u53EA\u6709\u5728\u6CE8\u518C\u767B\u5F55\u7684\u60C5\u51B5\u4E0B\u4F1A\u8FD4\u56DE
   **/
  public Admin key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6388\u6743\uFF0C\u53EA\u6709\u5728\u6CE8\u518C\u767B\u5F55\u7684\u60C5\u51B5\u4E0B\u4F1A\u8FD4\u56DE")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Admin admin = (Admin) o;
    return Objects.equals(this.password, admin.password) &&
        Objects.equals(this.name, admin.name) &&
        Objects.equals(this.id, admin.id) &&
        Objects.equals(this.email, admin.email) &&
        Objects.equals(this.key, admin.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, name, id, email, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Admin {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

