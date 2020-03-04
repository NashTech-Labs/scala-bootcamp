val formatter = java.text.NumberFormat.getCurrencyInstance

println(formatter.format(123.456789))

println(formatter.format(1234.56789))

println(formatter.format(12345.6789))

println(formatter.format(123456.789))

import java.util.{Currency, Locale}
val de = Currency.getInstance(new Locale("de", "DE"))
formatter.setCurrency(de)
println(formatter.format(123456.789))