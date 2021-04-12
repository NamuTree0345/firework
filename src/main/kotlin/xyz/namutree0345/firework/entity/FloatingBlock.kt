package xyz.namutree0345.firework.entity

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.entity.FallingBlock

class FloatingBlock(val block: Material) : FloatingComponent {

    private lateinit var fallingBlock: FallingBlock

    override fun spawn(location: Location) : FloatingBlock {
        fallingBlock = location.world.spawnFallingBlock(location, block.createBlockData())
        fallingBlock.setHurtEntities(false)
        fallingBlock.setGravity(false)

        return this
    }

    override fun teleport(location: Location) : FloatingBlock {
        fallingBlock.teleport(location)
        return this
    }

}