package io.github.cpearl0.ctnhcore.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTElements;
import io.github.cpearl0.ctnhcore.registry.CTNHElements;

import static io.github.cpearl0.ctnhcore.registry.CTNHMaterials.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGHEST;
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
    }
}
