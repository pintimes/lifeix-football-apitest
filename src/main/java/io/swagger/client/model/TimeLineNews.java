package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Post;
import java.util.ArrayList;
import java.util.List;



/**
 * \u65F6\u95F4\u8F74\u5F62\u5F0F\u7684\u65B0\u95FB
 **/

@ApiModel(description = "\u65F6\u95F4\u8F74\u5F62\u5F0F\u7684\u65B0\u95FB")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TimeLineNews   {
  
  private String date = null;
  private List<Post> posts = new ArrayList<Post>();

  
  /**
   * date,\u65F6\u95F4\u8F74\u4E0A\u65E5\u671F
   **/
  public TimeLineNews date(String date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "date,\u65F6\u95F4\u8F74\u4E0A\u65E5\u671F")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * \u6587\u7AE0
   **/
  public TimeLineNews posts(List<Post> posts) {
    this.posts = posts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6587\u7AE0")
  @JsonProperty("posts")
  public List<Post> getPosts() {
    return posts;
  }
  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeLineNews timeLineNews = (TimeLineNews) o;
    return Objects.equals(this.date, timeLineNews.date) &&
        Objects.equals(this.posts, timeLineNews.posts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, posts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeLineNews {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
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

