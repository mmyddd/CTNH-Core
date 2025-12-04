package io.github.cpearl0.ctnhcore.data.recipe.mana;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import io.github.cpearl0.ctnhcore.data.materials.ManaMaterials;
import io.github.cpearl0.ctnhcore.registry.*;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;

public class ManaCircuitRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        MANAREACTOR.recipeBuilder("soc_mana_electronic_circuit")
                .inputItems(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT)
                .inputItems(CTNHManaItems.MANA_SOC, 4)
                .inputItems(CTNHManaItems.ADVANCED_MANA_CAPACITOR,2)
                .inputItems(CTNHManaItems.ADVANCED_MANA_INDUCTOR,2)
                .notConsumable(CTNHManaItems.ELF_CATALYST)
                .inputFluids(CTNHMaterials.Mana, 5000)
                .outputItems(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT)
                .chancedOutput(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT.asStack(),8000,2000)
                .chancedOutput(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT.asStack(),6000,2000)
                .chancedOutput(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT.asStack(),4000,2000)
                .chancedOutput(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT.asStack(),2000,2000)
                .chancedOutput(CTNHManaItems.MANA_ELECTRONIC_CIRCUIT.asStack(),1,2000)
                .EUt(6666)
                .duration(200)
                .save(provider);

        MANAREACTOR.recipeBuilder("soc_mana_integrated_circuit")
                .inputItems(CTNHManaItems.MANA_INTEGRATED_CIRCUIT)
                .inputItems(CTNHManaItems.ZENITH_SOC, 4)
                .inputItems(ChemicalHelper.get(TagPrefix.foil, CTNHMaterials.AlfSteel, 16))
                .inputItems(ChemicalHelper.get(TagPrefix.bolt, CTNHMaterials.AlfSteel, 4))
                .inputFluids(CTNHMaterials.Mana, 25600)
                .inputFluids(CTNHMaterials.Zenith_essence, 800)
                .outputItems(CTNHManaItems.MANA_INTEGRATED_CIRCUIT)
                .chancedOutput(CTNHManaItems.MANA_INTEGRATED_CIRCUIT.asStack(),4000,3000)
                .chancedOutput(CTNHManaItems.MANA_INTEGRATED_CIRCUIT.asStack(),2000,3000)
                .chancedOutput(CTNHManaItems.MANA_INTEGRATED_CIRCUIT.asStack(),1000,4000)
                .EUt(14514)
                .duration(200)
                .save(provider);

        MANAREACTOR.recipeBuilder("mana_circuit_board")
                .inputItems(CTNHManaItems.STARLIGHT_RUNE)
                .inputItems(ChemicalHelper.get(TagPrefix.foil, CTNHMaterials.UltraMana, 64))
                .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.ReinforcedEpoxyResin, 32))
                .inputFluids(CTNHMaterials.ManaStableCooldown, 16000)
                .inputFluids(CTNHMaterials.Zenith_essence, 4000)
                .outputItems(CTNHManaItems.MANA_CIRCUIT_BOARD, 16)
                .EUt(12222)
                .duration(2000)
                .save(provider);

        GTRecipeTypes.CHEMICAL_RECIPES.recipeBuilder("zenith_soc")
                .inputItems(CTNHManaItems.MANA_SOC, 2)
                .inputFluids(CTNHMaterials.Zenith_essence, 200)
                .outputItems(CTNHManaItems.ZENITH_SOC)
                .EUt(6666)
                .duration(400)
                .save(provider);

        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("mana_soc_cutter")
                .inputItems(CTNHManaItems.MANA_WAFER, 2)
                .inputFluids(CTNHMaterials.Mana, 200)
                .outputItems(CTNHManaItems.MANA_SOC, 6)
                .EUt(GTValues.VA[GTValues.IV])
                .duration(400)
                .save(provider);

        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("zenith_soc_cutter")
                .inputItems(CTNHManaItems.ZENITH_WAFER)
                .inputFluids(CTNHMaterials.Mana, 1000)
                .outputItems(CTNHManaItems.ZENITH_SOC, 6)
                .EUt(GTValues.VA[GTValues.IV])
                .duration(800)
                .save(provider);

        HELLFORGE.recipeBuilder("demon")
                .inputItems(GTItems.NANO_COMPUTER_IV)
                .notConsumable(CTNHManaItems.ENDSLATE)
                .addData("minimumDrain", 2000)
                .addData("drain", 500)
                .outputItems(CTNHManaItems.WILL_NANO_PROCESSOR_MAINFRAME)
                .EUt(6666)
                .duration(200)
                .save(provider);

        GTRecipeTypes.CHEMICAL_RECIPES.recipeBuilder("umlhpic_wafer")
                .inputItems(GTItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER,32)
                .inputItems(CTNHManaItems.TWIST_RUNE)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana, 8))
                .inputFluids(CTNHMaterials.Zenith_essence, 4000)
                .inputFluids(CTNHMaterials.ElfFuel, 16000)
                .outputItems(CTNHManaItems.UMLHPIC_WAFER,16)
                .EUt(32840)
                .duration(2000)
                .save(provider);

        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("umlhpic_chip")
                .inputItems(CTNHManaItems.UMLHPIC_WAFER)
                .inputFluids(CTNHMaterials.Mana, 4000)
                .outputItems(CTNHManaItems.UMLHPIC_CHIP,3)
                .EUt(12222)
                .duration(900)
                .save(provider);

        GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("magic_quantum_processor_mainframe")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.QUANTUM_MAINFRAME_ZPM)
                .inputItems(CTNHManaItems.UMLHPIC_CHIP,4)
                .inputItems(CTNHManaItems.MANA_CIRCUIT_BOARD)
                .inputItems(ChemicalHelper.get(TagPrefix.frameGt, CTNHMaterials.UltraMana, 2))
                .outputItems(CTNHManaItems.MAGIC_QUANTUM_PROCESSOR_MAINFRAME)
                .EUt(32840)
                .duration(400)
                .save(provider);

        GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("magic_quantum_processor_mainframe2")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.CRYSTAL_COMPUTER_ZPM)
                .inputItems(GTItems.QUBIT_CENTRAL_PROCESSING_UNIT,4)
                .inputItems(CTNHManaItems.UMLHPIC_CHIP,4)
                .inputItems(CTNHManaItems.MANA_CIRCUIT_BOARD)
                .inputItems(ChemicalHelper.get(TagPrefix.frameGt, CTNHMaterials.UltraMana, 2))
                .outputItems(CTNHManaItems.MAGIC_QUANTUM_PROCESSOR_MAINFRAME)
                .EUt(32840)
                .duration(200)
                .save(provider);
    }
}