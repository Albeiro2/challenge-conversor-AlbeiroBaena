package Modelo;

import com.google.gson.annotations.SerializedName;

public record Rates(
        @SerializedName("USD") double usd,
        @SerializedName("BRL") double brl,
        @SerializedName("ARS") double ars,
        @SerializedName("COP") double cop
) {}

