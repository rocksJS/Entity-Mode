// package com.entity.items.shared;

// import net.minecraft.world.entity.ai.attributes.AttributeModifier;
// import net.minecraft.world.entity.ai.attributes.Attributes;
// import net.minecraft.world.item.component.ItemAttributeModifiers;

// import java.util.UUID;

// public class ItemAttributeHelper {

// public static ItemAttributeModifiers createSwordAttributes(double damage,
// double speed) {
// return ItemAttributeModifiers.builder()
// .add(
// Attributes.ATTACK_DAMAGE,
// new AttributeModifier(
// UUID.randomUUID(),
// "Weapon damage",
// damage,
// AttributeModifier.Operation.ADD_VALUE
// ),
// ItemAttributeModifiers.EquipmentSlotGroup.MAINHAND
// )
// .add(
// Attributes.ATTACK_SPEED,
// new AttributeModifier(
// UUID.randomUUID(),
// "Weapon speed",
// speed,
// AttributeModifier.Operation.ADD_VALUE
// ),
// ItemAttributeModifiers.EquipmentSlotGroup.MAINHAND
// )
// .build();
// }
// }
