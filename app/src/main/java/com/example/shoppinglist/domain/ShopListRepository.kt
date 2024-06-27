package com.example.shoppinglist.domain

interface ShopListRepository {
    fun deleteShopItem(shopItem: ShopItem)
    fun addShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): List<ShopItem>
}