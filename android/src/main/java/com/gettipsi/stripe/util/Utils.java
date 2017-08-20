package com.gettipsi.stripe.util;

import com.stripe.android.model.Card;

/**
 * Created by dmitriy on 11/25/16
 */

public class Utils {

    public static String validateCard(final Card card) {
        if (!card.validateNumber()) {
            return "El número de tarjeta ingresado no es válido";
        } else if (!card.validateExpiryDate()) {
            return "La fecha de expiración ingresada no es válida";
        } else if (!card.validateCVC()) {
            return "El código CVC ingresado es inválido";
        }
        return null;
    }

}
