package xyz.namutree0345.firework.entity

import org.bukkit.Location

interface FloatingComponent {

    fun spawn(location: Location) : FloatingComponent
    fun teleport(location: Location) : FloatingComponent

}