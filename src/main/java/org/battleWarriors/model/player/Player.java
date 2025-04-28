package org.battleWarriors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player 
{
    int id;
    String nickname;
    String accountName;
    String accountpassword;
    PlayerAttribute playerAttribute;

    public Player(int id, String nickname, String accountName, String accountPassword, PlayerAttribute playerAttribute)
    {
        this.id = id;
        this.nickname = nickname;
        this.accountName = accountName;
        this.accountpassword = accountPassword;
        this.playerAttribute = playerAttribute;
    }
}
