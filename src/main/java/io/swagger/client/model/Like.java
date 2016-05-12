package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Like
 **/

@ApiModel(description = "Like")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T08:03:38.486Z")
public class Like   {
  
  private String toId = null;
  private Integer num = null;
  private String id = null;
  private String type = null;
  private String fromId = null;
  private Boolean liked = null;

  
  /**
   * \u76EE\u6807Id\uFF0C\u6BD4\u5982\u65F6\u95F4\u8F74\u7403\u5458
   **/
  public Like toId(String toId) {
    this.toId = toId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u76EE\u6807Id\uFF0C\u6BD4\u5982\u65F6\u95F4\u8F74\u7403\u5458")
  @JsonProperty("toId")
  public String getToId() {
    return toId;
  }
  public void setToId(String toId) {
    this.toId = toId;
  }

  
  /**
   * toId\u88AB\u559C\u6B22\u7684\u603B\u6570
   **/
  public Like num(Integer num) {
    this.num = num;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "toId\u88AB\u559C\u6B22\u7684\u603B\u6570")
  @JsonProperty("num")
  public Integer getNum() {
    return num;
  }
  public void setNum(Integer num) {
    this.num = num;
  }

  
  /**
   * id
   **/
  public Like id(String id) {
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
   * \u7C7B\u578B\u6216\u8005\u8BF4\u4E1A\u52A1\u7CFB\u7EDF\uFF0C\u6BD4\u5982\uFF1Atimeline_tlplayer
   **/
  public Like type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7C7B\u578B\u6216\u8005\u8BF4\u4E1A\u52A1\u7CFB\u7EDF\uFF0C\u6BD4\u5982\uFF1Atimeline_tlplayer")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * \u53D1\u8D77\u8005Id\uFF0C\u6BD4\u5982\uFF1A\u5F53\u524Dmac\u5730\u5740
   **/
  public Like fromId(String fromId) {
    this.fromId = fromId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u53D1\u8D77\u8005Id\uFF0C\u6BD4\u5982\uFF1A\u5F53\u524Dmac\u5730\u5740")
  @JsonProperty("fromId")
  public String getFromId() {
    return fromId;
  }
  public void setFromId(String fromId) {
    this.fromId = fromId;
  }

  
  /**
   * fromId\u662F\u5426Like\u4E86toId\uFF0C\u6BD4\u5982<\u5F53\u524Dmac\u5730\u5740>\u559C\u6B22\u4E86<\u674E\u94C1> \u8FD4\u56DEtrue
   **/
  public Like liked(Boolean liked) {
    this.liked = liked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "fromId\u662F\u5426Like\u4E86toId\uFF0C\u6BD4\u5982<\u5F53\u524Dmac\u5730\u5740>\u559C\u6B22\u4E86<\u674E\u94C1> \u8FD4\u56DEtrue")
  @JsonProperty("liked")
  public Boolean getLiked() {
    return liked;
  }
  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Like like = (Like) o;
    return Objects.equals(this.toId, like.toId) &&
        Objects.equals(this.num, like.num) &&
        Objects.equals(this.id, like.id) &&
        Objects.equals(this.type, like.type) &&
        Objects.equals(this.fromId, like.fromId) &&
        Objects.equals(this.liked, like.liked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toId, num, id, type, fromId, liked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Like {\n");
    
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
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

