package org.tensorflow.lite.examples.classification

data class Resultado (val Name: String, val SeqID: Int, val GeoPt: Array<Double>, val TelPref: String, val CountryInfo: String,
                      val Capital: Capital, val GeoRectangle: Rectangulo, val CountryCodes: CodCountry)