data class ItemModel(val name: String)
data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit
)