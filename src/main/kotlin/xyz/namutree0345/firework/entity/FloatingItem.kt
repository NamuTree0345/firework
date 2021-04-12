package xyz.namutree0345.firework.entity

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.entity.Item
import org.bukkit.inventory.ItemStack

class FloatingItem(val item: Material) : FloatingComponent {

    private lateinit var entityItem: Item

    override fun spawn(location: Location) : FloatingItem {
        entityItem = location.world.dropItem(location, ItemStack(item))
        entityItem.setGravity(false)
        entityItem.setCanPlayerPickup(false)
        entityItem.setCanMobPickup(false)
        return this
    }

    override fun teleport(location: Location) : FloatingItem {
        entityItem.teleport(location)
        return this
    }

}