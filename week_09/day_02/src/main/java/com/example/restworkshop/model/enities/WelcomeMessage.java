package com.example.restworkshop.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WelcomeMessage {
    private String welcome_message;

    public WelcomeMessage(String welcome_message) {
        this.welcome_message = welcome_message;
    }


}
