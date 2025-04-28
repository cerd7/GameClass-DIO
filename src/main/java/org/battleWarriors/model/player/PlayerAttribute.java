package org.battleWarriors.model.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerAttribute 
{
    int accountLevel;
    int shotterLevel;
    int wizardLevel;
    int wariorLevel;

    public int getAccountLevel()
    {
        return accountLevel;
    }

    public void setAccountLevel(int newAccountLevel)
    {
        this.accountLevel = newAccountLevel;
    }

    public int getShotterLevel()
    {
        return shotterLevel;
    }

    public void setShotterLevel(int newShotterLevel)
    {
        this.shotterLevel = newShotterLevel;
    }

    public int getWizardLevel()
    {
        return wizardLevel;
    }

    public void setWizardLevel(int newWizardLevel)
    {
        this.wizardLevel = newWizardLevel;
    }

    public int getWarriorLevel()
    {
        return wariorLevel;
    }

    public void setWariorLevel(int newWariorLevel)
    {
        this.wariorLevel = newWariorLevel;
    }
}
