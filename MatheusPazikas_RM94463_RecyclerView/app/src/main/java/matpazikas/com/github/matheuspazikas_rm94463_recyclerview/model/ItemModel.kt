package matpazikas.com.github.matheuspazikas_rm94463_recyclerview.model

data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit
)