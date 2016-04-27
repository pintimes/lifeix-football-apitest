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
 * \u5E16\u5B50
 **/

@ApiModel(description = "\u5E16\u5B50")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-27T01:11:00.955Z")
public class Post   {
  
  private String id = null;
  private String content = null;
  private User author = null;
  private String title = null;
  private String description = null;
  private Date createTime = null;
  private Integer commentNum = null;
  private List<String> images = new ArrayList<String>();
  private Integer likeNum = null;
  private Date commentTime = null;
  private Boolean status = null;
  private Boolean top = null;
  private Boolean good = null;
  private Boolean hot = null;

  
  /**
   * id
   **/
  public Post id(String id) {
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
   * \u5185\u5BB9
   **/
  public Post content(String content) {
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
   **/
  public Post author(User author) {
    this.author = author;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("author")
  public User getAuthor() {
    return author;
  }
  public void setAuthor(User author) {
    this.author = author;
  }

  
  /**
   * \u6807\u9898
   **/
  public Post title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6807\u9898")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * \u63CF\u8FF0\uFF1A\u77ED\u63CF
   **/
  public Post description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u63CF\u8FF0\uFF1A\u77ED\u63CF")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * post\u521B\u5EFA\u65E5\u671F
   **/
  public Post createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "post\u521B\u5EFA\u65E5\u671F")
  @JsonProperty("createTime")
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  
  /**
   * \u8BC4\u8BBA\u6570\u76EE
   **/
  public Post commentNum(Integer commentNum) {
    this.commentNum = commentNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u8BC4\u8BBA\u6570\u76EE")
  @JsonProperty("commentNum")
  public Integer getCommentNum() {
    return commentNum;
  }
  public void setCommentNum(Integer commentNum) {
    this.commentNum = commentNum;
  }

  
  /**
   * \u56FE\u7247\u5730\u5740
   **/
  public Post images(List<String> images) {
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
   * \u559C\u6B22\u7684\u6570\u76EE
   **/
  public Post likeNum(Integer likeNum) {
    this.likeNum = likeNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u559C\u6B22\u7684\u6570\u76EE")
  @JsonProperty("likeNum")
  public Integer getLikeNum() {
    return likeNum;
  }
  public void setLikeNum(Integer likeNum) {
    this.likeNum = likeNum;
  }

  
  /**
   * \u6700\u65B0\u8BC4\u8BBA\u7684\u66F4\u65B0\u65F6\u95F4
   **/
  public Post commentTime(Date commentTime) {
    this.commentTime = commentTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6700\u65B0\u8BC4\u8BBA\u7684\u66F4\u65B0\u65F6\u95F4")
  @JsonProperty("commentTime")
  public Date getCommentTime() {
    return commentTime;
  }
  public void setCommentTime(Date commentTime) {
    this.commentTime = commentTime;
  }

  
  /**
   * true \u53EF\u89C1\u9ED8\u8BA4 false \u4E0D\u53EF\u89C1
   **/
  public Post status(Boolean status) {
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

  
  /**
   * true \u7F6E\u9876 false \u4E0D\u7F6E\u9876\u9ED8\u8BA4
   **/
  public Post top(Boolean top) {
    this.top = top;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true \u7F6E\u9876 false \u4E0D\u7F6E\u9876\u9ED8\u8BA4")
  @JsonProperty("top")
  public Boolean getTop() {
    return top;
  }
  public void setTop(Boolean top) {
    this.top = top;
  }

  
  /**
   * true \u52A0\u7CBE false \u4E0D\u52A0\u7CBE\u9ED8\u8BA4
   **/
  public Post good(Boolean good) {
    this.good = good;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true \u52A0\u7CBE false \u4E0D\u52A0\u7CBE\u9ED8\u8BA4")
  @JsonProperty("good")
  public Boolean getGood() {
    return good;
  }
  public void setGood(Boolean good) {
    this.good = good;
  }

  
  /**
   * true \u70ED\u5E16 false \u975E\u70ED\u5E16\u9ED8\u8BA4
   **/
  public Post hot(Boolean hot) {
    this.hot = hot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true \u70ED\u5E16 false \u975E\u70ED\u5E16\u9ED8\u8BA4")
  @JsonProperty("hot")
  public Boolean getHot() {
    return hot;
  }
  public void setHot(Boolean hot) {
    this.hot = hot;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(this.id, post.id) &&
        Objects.equals(this.content, post.content) &&
        Objects.equals(this.author, post.author) &&
        Objects.equals(this.title, post.title) &&
        Objects.equals(this.description, post.description) &&
        Objects.equals(this.createTime, post.createTime) &&
        Objects.equals(this.commentNum, post.commentNum) &&
        Objects.equals(this.images, post.images) &&
        Objects.equals(this.likeNum, post.likeNum) &&
        Objects.equals(this.commentTime, post.commentTime) &&
        Objects.equals(this.status, post.status) &&
        Objects.equals(this.top, post.top) &&
        Objects.equals(this.good, post.good) &&
        Objects.equals(this.hot, post.hot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, author, title, description, createTime, commentNum, images, likeNum, commentTime, status, top, good, hot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    commentNum: ").append(toIndentedString(commentNum)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    likeNum: ").append(toIndentedString(likeNum)).append("\n");
    sb.append("    commentTime: ").append(toIndentedString(commentTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    good: ").append(toIndentedString(good)).append("\n");
    sb.append("    hot: ").append(toIndentedString(hot)).append("\n");
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

