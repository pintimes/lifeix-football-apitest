package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * \u961F\u5458
 **/

@ApiModel(description = "\u961F\u5458")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TLPlayer   {
  
  private Integer number = null;
  private Integer score = null;
  private String country = null;
  private String showNum = null;
  private String birthplace = null;
  private String avatarUrl = null;
  private String name = null;
  private String id = null;
  private String position = null;
  private String team = null;
  private Integer likeNum = null;

  
  /**
   * \u53F7\u7801
   **/
  public TLPlayer number(Integer number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u53F7\u7801")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   * \u672C\u6B21\u8D5B\u4E8B\u8FDB\u7403\u6570
   **/
  public TLPlayer score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u672C\u6B21\u8D5B\u4E8B\u8FDB\u7403\u6570")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  
  /**
   * \u56FD\u5BB6\uFF1A \u4E2D\u56FD
   **/
  public TLPlayer country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u56FD\u5BB6\uFF1A \u4E2D\u56FD")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * \u672C\u6B21\u8D5B\u4E8B\u51FA\u573A\u6B21\u6570
   **/
  public TLPlayer showNum(String showNum) {
    this.showNum = showNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u672C\u6B21\u8D5B\u4E8B\u51FA\u573A\u6B21\u6570")
  @JsonProperty("showNum")
  public String getShowNum() {
    return showNum;
  }
  public void setShowNum(String showNum) {
    this.showNum = showNum;
  }

  
  /**
   * \u51FA\u751F\u5730  \u4E2D\u56FD\u5317\u4EAC
   **/
  public TLPlayer birthplace(String birthplace) {
    this.birthplace = birthplace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u51FA\u751F\u5730  \u4E2D\u56FD\u5317\u4EAC")
  @JsonProperty("birthplace")
  public String getBirthplace() {
    return birthplace;
  }
  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  
  /**
   * \u5934\u50CF\u5730\u5740
   **/
  public TLPlayer avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5934\u50CF\u5730\u5740")
  @JsonProperty("avatarUrl")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  
  /**
   * \u540D\u5B57\uFF1A\u674E\u94C1
   **/
  public TLPlayer name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u540D\u5B57\uFF1A\u674E\u94C1")
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
  public TLPlayer id(String id) {
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
   * \u4F4D\u7F6E\uFF1A\u524D\u950B
   **/
  public TLPlayer position(String position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u4F4D\u7F6E\uFF1A\u524D\u950B")
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  
  /**
   * \u6240\u5C5E\u7403\u961F\uFF1A\u56FD\u5BB6\u961F
   **/
  public TLPlayer team(String team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6240\u5C5E\u7403\u961F\uFF1A\u56FD\u5BB6\u961F")
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }
  public void setTeam(String team) {
    this.team = team;
  }

  
  /**
   * \u7528\u6237\u70B9\u8D5E\u6570\u76EE
   **/
  public TLPlayer likeNum(Integer likeNum) {
    this.likeNum = likeNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7528\u6237\u70B9\u8D5E\u6570\u76EE")
  @JsonProperty("likeNum")
  public Integer getLikeNum() {
    return likeNum;
  }
  public void setLikeNum(Integer likeNum) {
    this.likeNum = likeNum;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLPlayer tLPlayer = (TLPlayer) o;
    return Objects.equals(this.number, tLPlayer.number) &&
        Objects.equals(this.score, tLPlayer.score) &&
        Objects.equals(this.country, tLPlayer.country) &&
        Objects.equals(this.showNum, tLPlayer.showNum) &&
        Objects.equals(this.birthplace, tLPlayer.birthplace) &&
        Objects.equals(this.avatarUrl, tLPlayer.avatarUrl) &&
        Objects.equals(this.name, tLPlayer.name) &&
        Objects.equals(this.id, tLPlayer.id) &&
        Objects.equals(this.position, tLPlayer.position) &&
        Objects.equals(this.team, tLPlayer.team) &&
        Objects.equals(this.likeNum, tLPlayer.likeNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, score, country, showNum, birthplace, avatarUrl, name, id, position, team, likeNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLPlayer {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    showNum: ").append(toIndentedString(showNum)).append("\n");
    sb.append("    birthplace: ").append(toIndentedString(birthplace)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    likeNum: ").append(toIndentedString(likeNum)).append("\n");
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

