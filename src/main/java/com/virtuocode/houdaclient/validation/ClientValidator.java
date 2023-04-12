package com.virtuocode.houdaclient.validation;

import com.virtuocode.houdaclient.dto.ClientDto;

public class ClientValidator {

    public static String validateClient(ClientDto clientDto){
        String error = "";
        if (clientDto.getFirstName().length() < 2)
            error = "FirstName is too short";
        if (clientDto.getLastName().length() < 2)
            error = "LastName is too short";

        if (!ClientValidator.isValidEmailAddress(clientDto.getEmail()))
            return error = "Please insert a correct email";
        return error;
    }

    private static boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
}
