package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TLPlayer;
import java.util.ArrayList;
import java.util.List;



/**
 * \u53C2\u8D5B\u961F
 **/

@ApiModel(description = "\u53C2\u8D5B\u961F")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TLTeam   {
  
  private String avatarUrl = null;
  private List<TLPlayer> players = new ArrayList<TLPlayer>();
  private String name = null;
  private String id = null;

  
  /**
   * \u5934\u50CF\u5730\u5740
   **/
  public TLTeam avatarUrl(String avatarUrl) {
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
   * \u5BA2\u573A\u7403\u961F
   **/
  public TLTeam players(List<TLPlayer> players) {
    this.players = players;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u5BA2\u573A\u7403\u961F")
  @JsonProperty("players")
  public List<TLPlayer> getPlayers() {
    return players;
  }
  public void setPlayers(List<TLPlayer> players) {
    this.players = players;
  }

  
  /**
   * \u7403\u961F\u540D\u79F0\uFF1A\u4E2D\u56FD\u961F
   **/
  public TLTeam name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "\u7403\u961F\u540D\u79F0\uFF1A\u4E2D\u56FD\u961F")
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
  public TLTeam id(String id) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLTeam tLTeam = (TLTeam) o;
    return Objects.equals(this.avatarUrl, tLTeam.avatarUrl) &&
        Objects.equals(this.players, tLTeam.players) &&
        Objects.equals(this.name, tLTeam.name) &&
        Objects.equals(this.id, tLTeam.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, players, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLTeam {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

