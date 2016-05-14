package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u89C6\u9891
 **/

@ApiModel(description = "\u89C6\u9891")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class Video   {
  
  private String preview = null;
  private Integer time = null;
  private String url = null;

  
  /**
   * \u9884\u89C8\u56FE\u7247
   **/
  public Video preview(String preview) {
    this.preview = preview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u9884\u89C8\u56FE\u7247")
  @JsonProperty("preview")
  public String getPreview() {
    return preview;
  }
  public void setPreview(String preview) {
    this.preview = preview;
  }

  
  /**
   * \u89C6\u9891\u65F6\u5E38
   **/
  public Video time(Integer time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u89C6\u9891\u65F6\u5E38")
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  
  /**
   * \u89C6\u9891\u8BBF\u95EE\u5730\u5740
   **/
  public Video url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u89C6\u9891\u8BBF\u95EE\u5730\u5740")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.preview, video.preview) &&
        Objects.equals(this.time, video.time) &&
        Objects.equals(this.url, video.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preview, time, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

