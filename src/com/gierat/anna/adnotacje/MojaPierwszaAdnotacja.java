package com.gierat.anna.adnotacje;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MojaPierwszaAdnotacja {

    String to();
}
