package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * \u8BC4\u8BBA
 **/

@ApiModel(description = "\u8BC4\u8BBA")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T02:16:00.506Z")
public class Comment   {
  
  private List<String> images = new ArrayList<String>();
  private Date createTime = null;
  private String id = null;
  private String postId = null;
  private User user = null;
  private Integer floorNum = null;
  private String content = null;
  private Boolean status = null;

  
  /**
   * \u56FE\u7247\u5730\u5740
   **/
  public Comment images(List<String> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u56FE\u7247\u5730\u5740")
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }
  public void setImages(List<String> images) {
    this.images = images;
  }

  
  /**
   * \u521B\u5EFA\u65E5\u671F
   **/
  public Comment createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u521B\u5EFA\u65E5\u671F")
  @JsonProperty("createTime")
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  
  /**
   * id
   **/
  public Comment id(String id) {
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
   * \u8BC4\u8BBA\u5BF9\u5E94\u7684post id
   **/
  public Comment postId(String postId) {
    this.postId = postId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u8BC4\u8BBA\u5BF9\u5E94\u7684post id")
  @JsonProperty("postId")
  public String getPostId() {
    return postId;
  }
  public void setPostId(String postId) {
    this.postId = postId;
  }

  
  /**
   **/
  public Comment user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * \u697C\u5C42
   **/
  public Comment floorNum(Integer floorNum) {
    this.floorNum = floorNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u697C\u5C42")
  @JsonProperty("floorNum")
  public Integer getFloorNum() {
    return floorNum;
  }
  public void setFloorNum(Integer floorNum) {
    this.floorNum = floorNum;
  }

  
  /**
   * \u5185\u5BB9
   **/
  public Comment content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5185\u5BB9")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * true \u53EF\u89C1\u9ED8\u8BA4 false \u4E0D\u53EF\u89C1
   **/
  public Comment status(Boolean status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true \u53EF\u89C1\u9ED8\u8BA4 false \u4E0D\u53EF\u89C1")
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.images, comment.images) &&
        Objects.equals(this.createTime, comment.createTime) &&
        Objects.equals(this.id, comment.id) &&
        Objects.equals(this.postId, comment.postId) &&
        Objects.equals(this.user, comment.user) &&
        Objects.equals(this.floorNum, comment.floorNum) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.status, comment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, createTime, id, postId, user, floorNum, content, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    floorNum: ").append(toIndentedString(floorNum)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

