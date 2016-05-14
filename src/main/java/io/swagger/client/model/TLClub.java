package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u4FF1\u4E50\u90E8
 **/

@ApiModel(description = "\u4FF1\u4E50\u90E8")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TLClub   {
  
  private String name = null;
  private String id = null;
  private String iconUrl = null;

  
  /**
   * \u540D\u79F0\uFF1A\u5C71\u4E1C\u9C81\u80FD
   **/
  public TLClub name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u540D\u79F0\uFF1A\u5C71\u4E1C\u9C81\u80FD")
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
  public TLClub id(String id) {
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
   * \u4FF1\u4E50\u90E8\u56FE\u7247\u5730\u5740
   **/
  public TLClub iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4FF1\u4E50\u90E8\u56FE\u7247\u5730\u5740")
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLClub tLClub = (TLClub) o;
    return Objects.equals(this.name, tLClub.name) &&
        Objects.equals(this.id, tLClub.id) &&
        Objects.equals(this.iconUrl, tLClub.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, iconUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLClub {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

