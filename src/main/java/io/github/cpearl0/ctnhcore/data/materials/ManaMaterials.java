package io.github.cpearl0.ctnhcore.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTElements;
import io.github.cpearl0.ctnhcore.registry.CTNHElements;
import net.minecraft.world.level.redstone.Redstone;

import static io.github.cpearl0.ctnhcore.registry.CTNHMaterials.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.*;
import static io.github.cpearl0.ctnhcore.registry.CTNHRegistration.REGISTRATE;


public class ManaMaterials {
    public static void init() {
        UltraMana = REGISTRATE.material(GTCEu.id("ultra_mana"))
                .cnlang("究极魔力")
                .ingot()
                .blastTemp(7200, HIGHEST, 122222, 1000)
                .element(CTNHElements.ULTRA_MANA)
                .color(0x4ac6e6)
                .iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW, GENERATE_FOIL, GENERATE_FRAME, GENERATE_RING)
                .cableProperties(GTValues.V[GTValues.ZPM], 8, 1, false)
                .buildAndRegister();
        ManaPlus = REGISTRATE.material(GTCEu.id("mana_plus"))
                .cnlang("富集魔力")
                .liquid()
                .ingot()
                .dust()
                .element(CTNHElements.MANA_PLUS)
                .color(0x1f6eb8)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW, GENERATE_FOIL, GENERATE_FRAME, GENERATE_RING)
                .buildAndRegister();
        ManaSuperPlus = REGISTRATE.material(GTCEu.id("mana_super_plus"))
                .cnlang("临界富集魔力")
                .liquid()
                .dust()
                .ingot()
                .color(0x0a59a3)
                .element(CTNHElements.MANA_SUPER_PLUS)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW, GENERATE_FOIL, GENERATE_FRAME, GENERATE_RING)
                .buildAndRegister();
        ManaStableCooldown = REGISTRATE.material(GTCEu.id("mana_stable_cooldown"))
                .cnlang("魔力稳定剂")
                .liquid()
                .color(0x28358A)
                .buildAndRegister();
        ElfFuel = REGISTRATE.material(GTCEu.id("elf_fuel"))
                .cnlang("精灵稳定燃料")
                .liquid()
                .color(0x28358A)
                .buildAndRegister()
                .setFormula("ArNeC2O4Ma", true);
        ElfFuelActive = REGISTRATE.material(GTCEu.id("elf_active_fuel"))
                .cnlang("精灵激发燃料")
                .liquid()
                .color(0x28358A)
                .buildAndRegister();
        StarlightFuel = REGISTRATE.material(GTCEu.id("starlight_fuel"))
                .cnlang("原质亚尔夫海姆行星燃料")
                .liquid()
                .color(0XFFC107)
                .buildAndRegister();
        StarlightFuelActive = REGISTRATE.material(GTCEu.id("starlight_fuel_actives"))
                .cnlang("亚尔夫海姆行星燃料(激发态)")
                .liquid()
                .color(0XFFC107)
                .buildAndRegister();
        StarlightFuelExhausted = REGISTRATE.material(GTCEu.id("starlight_fuel_exhausted"))
                .cnlang("亚尔夫海姆行星燃料(枯竭态)")
                .liquid()
                .color(0XFFC107)
                .buildAndRegister();
        BloodFuel= REGISTRATE.material(GTCEu.id("blood_fuel"))
                .cnlang("生命原质燃料")
                .liquid()
                .color((0XFF0000))
                .buildAndRegister();
        BloodFuelActive= REGISTRATE.material(GTCEu.id("blood_fuel_active"))
                .cnlang("生命原质燃料(恶魔激活态)")
                .liquid()
                .color((0XFF0000))
                .buildAndRegister();
        BloodFuelExhausted= REGISTRATE.material(GTCEu.id("blood_fuel_exhausted"))
                .cnlang("生命原质燃料(恶魔意志枯竭态)")
                .liquid()
                .color((0XFF0000))
                .buildAndRegister();
        ManaUpFuel= REGISTRATE.material(GTCEu.id("mana_up_fuel"))
                .cnlang("原质究极魔力燃料")
                .liquid()
                .color((0x28358A))
                .buildAndRegister();
        ManaUpFuelActive= REGISTRATE.material(GTCEu.id("mana_up_fuel_active"))
                .cnlang("究极魔力燃料(激发态)")
                .liquid()
                .color((0x28358A))
                .buildAndRegister();
        ManaUpFuelExhausted= REGISTRATE.material(GTCEu.id("mana_up_fuel_exhausted"))
                .cnlang("究极魔力燃料(枯竭态)")
                .liquid()
                .color((0x28358A))
                .buildAndRegister();
        StarFuel= REGISTRATE.material(GTCEu.id("star_up_fuel"))
                .cnlang("恒星旋律燃料")
                .liquid()
                .color((0XFFD700))
                .buildAndRegister();
        StarFuelActive= REGISTRATE.material(GTCEu.id("star_fuel_active"))
                .cnlang("恒星旋律燃料(激发态)")
                .liquid()
                .color((0XFFD700))
                .buildAndRegister();
        StarFuelExhausted= REGISTRATE.material(GTCEu.id("star_fuel_exhausted"))
                .cnlang("恒星旋律燃料(枯竭态)")
                .liquid()
                .color((0XFFD700))
                .buildAndRegister();
        LiquidAlfheimAir= REGISTRATE.material(GTCEu.id("liquid_alfheim_air"))
                .cnlang("液态亚尔夫海姆空气")
                .liquid()
                .blastTemp(74)
                .color(0xb981c9)
                .buildAndRegister();
        ManaRadiationMixture= REGISTRATE.material(GTCEu.id("mana_radiation_mixture"))
                .cnlang("混合辐射魔力激发液")
                .liquid()
                .color(0xFF14)
                .buildAndRegister()
                .setFormula("ThUPuRnNqMa??", true);
    }
}
