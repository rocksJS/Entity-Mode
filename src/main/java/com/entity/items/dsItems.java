package com.entity.items;

import com.entity.Entity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class dsItems {

    // Стеклянный меч
    public static final Item GLASS_SWORD = register(
            new SwordItem(
                    Tiers.NETHERITE,
                    new Item.Properties()
                            .stacksTo(1)
                            .attributes(
                                    ItemAttributeModifiers.builder()
                                            .add(
                                                    Attributes.ATTACK_DAMAGE,
                                                    new AttributeModifier(
                                                            ResourceLocation
                                                                    .tryParse(Entity.MOD_ID + ":glass_sword_damage"),
                                                            45.0,
                                                            AttributeModifier.Operation.ADD_VALUE),
                                                    EquipmentSlotGroup.MAINHAND)
                                            .add(
                                                    Attributes.ATTACK_SPEED,
                                                    new AttributeModifier(
                                                            ResourceLocation
                                                                    .tryParse(Entity.MOD_ID + ":glass_sword_speed"),
                                                            -2.4,
                                                            AttributeModifier.Operation.ADD_VALUE),
                                                    EquipmentSlotGroup.MAINHAND)
                                            .build())),
            "glass_sword");

    // Регистрация предмета
    private static Item register(Item item, String id) {
        ResourceLocation itemID = ResourceLocation.tryParse(Entity.MOD_ID + ":" + id);
        if (itemID == null) {
            throw new IllegalArgumentException("Invalid item ID: " + id);
        }
        return Registry.register(BuiltInRegistries.ITEM, itemID, item);
    }

    // Инициализация
    public static void init() {
        System.out.println("dsItems initialized!");
    }
}
