package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TLTeam;
import java.util.Date;



/**
 * 12\u5F3A\u8D5B\u5BF9\u8C61
 **/

@ApiModel(description = "12\u5F3A\u8D5B\u5BF9\u8C61")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T02:16:00.506Z")
public class TLCompetition   {
  
  private TLTeam hostTeam = null;
  private Integer guestScore = null;
  private Integer hostScore = null;
  private Double lal = null;
  private String name = null;
  private TLTeam guestTeam = null;
  private String id = null;
  private Date time = null;
  private String place = null;

  
  /**
   **/
  public TLCompetition hostTeam(TLTeam hostTeam) {
    this.hostTeam = hostTeam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hostTeam")
  public TLTeam getHostTeam() {
    return hostTeam;
  }
  public void setHostTeam(TLTeam hostTeam) {
    this.hostTeam = hostTeam;
  }

  
  /**
   * \u5F53\u524D\u5BA2\u573A\u5F97\u5206
   **/
  public TLCompetition guestScore(Integer guestScore) {
    this.guestScore = guestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5F53\u524D\u5BA2\u573A\u5F97\u5206")
  @JsonProperty("guestScore")
  public Integer getGuestScore() {
    return guestScore;
  }
  public void setGuestScore(Integer guestScore) {
    this.guestScore = guestScore;
  }

  
  /**
   * \u5F53\u524D\u4E3B\u573A\u5F97\u5206
   **/
  public TLCompetition hostScore(Integer hostScore) {
    this.hostScore = hostScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5F53\u524D\u4E3B\u573A\u5F97\u5206")
  @JsonProperty("hostScore")
  public Integer getHostScore() {
    return hostScore;
  }
  public void setHostScore(Integer hostScore) {
    this.hostScore = hostScore;
  }

  
  /**
   * \u7ECF\u7EAC\u5EA6\uFF1Alongitude and latitude
   **/
  public TLCompetition lal(Double lal) {
    this.lal = lal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7ECF\u7EAC\u5EA6\uFF1Alongitude and latitude")
  @JsonProperty("lal")
  public Double getLal() {
    return lal;
  }
  public void setLal(Double lal) {
    this.lal = lal;
  }

  
  /**
   * \u6BD4\u8D5B\u540D\u79F0\uFF1A\u4E2D\u56FD\u961F\u4E3B\u573A\u5BF9\u97E9\u56FD
   **/
  public TLCompetition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6BD4\u8D5B\u540D\u79F0\uFF1A\u4E2D\u56FD\u961F\u4E3B\u573A\u5BF9\u97E9\u56FD")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public TLCompetition guestTeam(TLTeam guestTeam) {
    this.guestTeam = guestTeam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("guestTeam")
  public TLTeam getGuestTeam() {
    return guestTeam;
  }
  public void setGuestTeam(TLTeam guestTeam) {
    this.guestTeam = guestTeam;
  }

  
  /**
   * id
   **/
  public TLCompetition id(String id) {
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
   * \u6BD4\u8D5B\u65F6\u95F4:2016-02-01 12:00:00
   **/
  public TLCompetition time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6BD4\u8D5B\u65F6\u95F4:2016-02-01 12:00:00")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  
  /**
   * \u6BD4\u8D5B\u5730\u70B9\uFF1A\u4E2D\u56FD\u5317\u4EAC
   **/
  public TLCompetition place(String place) {
    this.place = place;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u6BD4\u8D5B\u5730\u70B9\uFF1A\u4E2D\u56FD\u5317\u4EAC")
  @JsonProperty("place")
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLCompetition tLCompetition = (TLCompetition) o;
    return Objects.equals(this.hostTeam, tLCompetition.hostTeam) &&
        Objects.equals(this.guestScore, tLCompetition.guestScore) &&
        Objects.equals(this.hostScore, tLCompetition.hostScore) &&
        Objects.equals(this.lal, tLCompetition.lal) &&
        Objects.equals(this.name, tLCompetition.name) &&
        Objects.equals(this.guestTeam, tLCompetition.guestTeam) &&
        Objects.equals(this.id, tLCompetition.id) &&
        Objects.equals(this.time, tLCompetition.time) &&
        Objects.equals(this.place, tLCompetition.place);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostTeam, guestScore, hostScore, lal, name, guestTeam, id, time, place);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLCompetition {\n");
    
    sb.append("    hostTeam: ").append(toIndentedString(hostTeam)).append("\n");
    sb.append("    guestScore: ").append(toIndentedString(guestScore)).append("\n");
    sb.append("    hostScore: ").append(toIndentedString(hostScore)).append("\n");
    sb.append("    lal: ").append(toIndentedString(lal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    guestTeam: ").append(toIndentedString(guestTeam)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
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

