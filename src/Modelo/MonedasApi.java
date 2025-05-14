package Modelo;

import com.google.gson.annotations.SerializedName;

public record MonedasApi(
        @SerializedName("conversion_rates") Rates rates
) {}



