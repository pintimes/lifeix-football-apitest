package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Author;
import io.swagger.client.model.Video;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * \u5E16\u5B50
 **/

@ApiModel(description = "\u5E16\u5B50")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class Post   {
  
  private List<String> images = new ArrayList<String>();
  private Date createTime = null;
  private Author author = null;
  private List<Video> videos = new ArrayList<Video>();
  private String id = null;
  private List<String> categories = new ArrayList<String>();
  private String title = null;
  private Integer classification = null;
  private String content = null;
  private String createDate = null;
  private Integer status = null;

  
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
   **/
  public Post author(Author author) {
    this.author = author;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("author")
  public Author getAuthor() {
    return author;
  }
  public void setAuthor(Author author) {
    this.author = author;
  }

  
  /**
   * \u89C6\u9891\u5730\u5740
   **/
  public Post videos(List<Video> videos) {
    this.videos = videos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u89C6\u9891\u5730\u5740")
  @JsonProperty("videos")
  public List<Video> getVideos() {
    return videos;
  }
  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  
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
   * \u6587\u7AE0\u7C7B\u522B
   **/
  public Post categories(List<String> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6587\u7AE0\u7C7B\u522B")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
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
   * \u5206\u7C7B
   **/
  public Post classification(Integer classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5206\u7C7B")
  @JsonProperty("classification")
  public Integer getClassification() {
    return classification;
  }
  public void setClassification(Integer classification) {
    this.classification = classification;
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
   * \u521B\u5EFA\u65E5\u671F(\u5929)
   **/
  public Post createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u521B\u5EFA\u65E5\u671F(\u5929)")
  @JsonProperty("createDate")
  public String getCreateDate() {
    return createDate;
  }
  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  
  /**
   * \u72B6\u6001,\u9ED8\u8BA41:\u53EF\u89C1 0:\u4E0D\u53EF\u89C1
   **/
  public Post status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u72B6\u6001,\u9ED8\u8BA41:\u53EF\u89C1 0:\u4E0D\u53EF\u89C1")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
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
    Post post = (Post) o;
    return Objects.equals(this.images, post.images) &&
        Objects.equals(this.createTime, post.createTime) &&
        Objects.equals(this.author, post.author) &&
        Objects.equals(this.videos, post.videos) &&
        Objects.equals(this.id, post.id) &&
        Objects.equals(this.categories, post.categories) &&
        Objects.equals(this.title, post.title) &&
        Objects.equals(this.classification, post.classification) &&
        Objects.equals(this.content, post.content) &&
        Objects.equals(this.createDate, post.createDate) &&
        Objects.equals(this.status, post.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, createTime, author, videos, id, categories, title, classification, content, createDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

