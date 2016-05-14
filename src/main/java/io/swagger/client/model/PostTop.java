package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u7F6E\u9876\u6587\u7AE0
 **/

@ApiModel(description = "\u7F6E\u9876\u6587\u7AE0")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class PostTop   {
  
  private String parent = null;
  private String postIds = null;
  private String categoryName = null;
  private String categoryId = null;

  
  /**
   * \u7236\u7C7B\u76EEid
   **/
  public PostTop parent(String parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7236\u7C7B\u76EEid")
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }
  public void setParent(String parent) {
    this.parent = parent;
  }

  
  /**
   * \u6587\u7AE0id.example:111,222,333 \u7F6E\u9876\u7684\u6587\u7AE0id\u4EE5,\u5206\u9694.top\u65B0\u95FB\u7684\u663E\u793A\u987A\u5E8F\u5373id\u5728\u5B57\u7B26\u4E32\u4E2D\u7684\u663E\u793A\u987A\u5E8F
   **/
  public PostTop postIds(String postIds) {
    this.postIds = postIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6587\u7AE0id.example:111,222,333 \u7F6E\u9876\u7684\u6587\u7AE0id\u4EE5,\u5206\u9694.top\u65B0\u95FB\u7684\u663E\u793A\u987A\u5E8F\u5373id\u5728\u5B57\u7B26\u4E32\u4E2D\u7684\u663E\u793A\u987A\u5E8F")
  @JsonProperty("postIds")
  public String getPostIds() {
    return postIds;
  }
  public void setPostIds(String postIds) {
    this.postIds = postIds;
  }

  
  /**
   * \u7C7B\u76EE\u540D\u79F0
   **/
  public PostTop categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7C7B\u76EE\u540D\u79F0")
  @JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  
  /**
   * categoryId
   **/
  public PostTop categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "categoryId")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTop postTop = (PostTop) o;
    return Objects.equals(this.parent, postTop.parent) &&
        Objects.equals(this.postIds, postTop.postIds) &&
        Objects.equals(this.categoryName, postTop.categoryName) &&
        Objects.equals(this.categoryId, postTop.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, postIds, categoryName, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTop {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    postIds: ").append(toIndentedString(postIds)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

