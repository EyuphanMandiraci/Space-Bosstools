package net.mrscauthd.boss_tools.procedures;

import net.mrscauthd.boss_tools.item.SpaceArmorItem;
import net.mrscauthd.boss_tools.BossToolsModVariables;
import net.mrscauthd.boss_tools.BossToolsModElements;
import net.mrscauthd.boss_tools.BossToolsMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

@BossToolsModElements.ModElement.Tag
public class AkivepotionProcedure extends BossToolsModElements.ModElement {
	public AkivepotionProcedure(BossToolsModElements instance) {
		super(instance, 139);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BossToolsMod.LOGGER.warn("Failed to load dependency entity for procedure Akivepotion!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BossToolsMod.LOGGER.warn("Failed to load dependency world for procedure Akivepotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		double Damage = 0;
		if (((entity.getPersistentData().getBoolean("Oxygen_Bullet_Generator")) == (true))) {
			entity.getPersistentData().putBoolean("SpaceSuitH", (true));
			entity.getPersistentData().putBoolean("SpaceSuitC", (true));
			entity.getPersistentData().putBoolean("SpaceSuitL", (true));
			entity.getPersistentData().putBoolean("SpaceSuitB", (true));
		}
		if ((((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
				new ResourceLocation("boss_tools:moon"))))
				|| (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey
						.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("boss_tools:mars"))))
						|| (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey
								.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("boss_tools:orbit_overworld"))))
								|| (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey
										.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("boss_tools:mercury"))))
										|| (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey
												.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("boss_tools:orbit_moon"))))
												|| (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey
														.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("boss_tools:orbit_mars"))))
														|| ((world instanceof World
																? (((World) world).getDimensionKey())
																: World.OVERWORLD) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
																		new ResourceLocation("boss_tools:orbit_mercury"))))))))))) {// Config
			if ((!(entity.getPersistentData().getBoolean("Oxygen_Bullet_Generator")))) {
				if (((BossToolsModVariables.oxygen_system) == 1)) {
					if (((entity.getPersistentData().getBoolean("SpaceSuitH")) == (false))) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).attackEntityFrom(new DamageSource("oxygen").setDamageBypassesArmor(), (float) 1);
						}
					}
					if (((entity.getPersistentData().getBoolean("SpaceSuitC")) == (false))) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).attackEntityFrom(new DamageSource("oxygen").setDamageBypassesArmor(), (float) 1);
						}
					}
					if (((entity.getPersistentData().getBoolean("SpaceSuitL")) == (false))) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).attackEntityFrom(new DamageSource("oxygen").setDamageBypassesArmor(), (float) 1);
						}
					}
					if (((entity.getPersistentData().getBoolean("SpaceSuitB")) == (false))) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).attackEntityFrom(new DamageSource("oxygen").setDamageBypassesArmor(), (float) 1);
						}
					}
				}
			}
		}
		if ((!(entity.getPersistentData().getBoolean("Oxygen_Bullet_Generator")))) {
			if ((!(((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
					: ItemStack.EMPTY).getItem() == new ItemStack(SpaceArmorItem.helmet, (int) (1)).getItem()))) {
				entity.getPersistentData().putBoolean("SpaceSuitH", (false));
			}
			if ((!(((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
					: ItemStack.EMPTY).getItem() == new ItemStack(SpaceArmorItem.body, (int) (1)).getItem()))) {
				entity.getPersistentData().putBoolean("SpaceSuitC", (false));
			}
			if ((!(((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
					: ItemStack.EMPTY).getItem() == new ItemStack(SpaceArmorItem.legs, (int) (1)).getItem()))) {
				entity.getPersistentData().putBoolean("SpaceSuitL", (false));
			}
			if ((!(((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
					: ItemStack.EMPTY).getItem() == new ItemStack(SpaceArmorItem.boots, (int) (1)).getItem()))) {
				entity.getPersistentData().putBoolean("SpaceSuitB", (false));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
