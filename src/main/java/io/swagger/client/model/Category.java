package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Category;
import java.util.ArrayList;
import java.util.List;



/**
 * \u7C7B\u76EE
 **/

@ApiModel(description = "\u7C7B\u76EE")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T07:53:17.665Z")
public class Category   {
  
  private String fId = null;
  private String name = null;
  private String id = null;
  private String iconUrl = null;
  private List<Category> categories = new ArrayList<Category>();

  
  /**
   * \u7236\u76EE\u5F55Id
   **/
  public Category fId(String fId) {
    this.fId = fId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7236\u76EE\u5F55Id")
  @JsonProperty("fId")
  public String getFId() {
    return fId;
  }
  public void setFId(String fId) {
    this.fId = fId;
  }

  
  /**
   * \u7C7B\u76EE\u540D\u79F0
   **/
  public Category name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7C7B\u76EE\u540D\u79F0")
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
  public Category id(String id) {
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
   * \u7C7B\u76EE\u56FE\u6807\u5730\u5740
   **/
  public Category iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7C7B\u76EE\u56FE\u6807\u5730\u5740")
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  
  /**
   * \u5B50\u7C7B\u76EE
   **/
  public Category categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5B50\u7C7B\u76EE")
  @JsonProperty("categories")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.fId, category.fId) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.id, category.id) &&
        Objects.equals(this.iconUrl, category.iconUrl) &&
        Objects.equals(this.categories, category.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fId, name, id, iconUrl, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    fId: ").append(toIndentedString(fId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

