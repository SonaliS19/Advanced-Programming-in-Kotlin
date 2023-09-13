data class IngredientClass(val name: String, val stockUnits: Int)

val ingredientList =
        listOf(
                IngredientClass("Olive Oil", 7),
                IngredientClass("Wheat", 3),
                IngredientClass("Soda", 10),
                IngredientClass("Egg", 0),
                IngredientClass("Yeast", 2)
        )

fun main() {
    val ingredientsToRefill = ingredientList.filter { ingredient -> ingredient.stockUnits <= 5 }
    println(ingredientsToRefill)
}
// [IngredientClass(name=Wheat, stockUnits=3), IngredientClass(name=Egg, stockUnits=0),
// IngredientClass(name=Yeast, stockUnits=2)]
