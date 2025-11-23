package io.github.cpearl0.ctnhcore.data.recipe.mana;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import fr.lucreeper74.createmetallurgy.data.recipes.CMRecipeProvider;
import fr.lucreeper74.createmetallurgy.registries.CMRecipeTypes;
import io.github.cpearl0.ctnhcore.registry.CTNHBlocks;
import io.github.cpearl0.ctnhcore.registry.CTNHFluidVeins;
import io.github.cpearl0.ctnhcore.registry.CTNHItems;
import io.github.cpearl0.ctnhcore.registry.CTNHMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHMaterial;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHRecipeType;
import vazkii.botania.common.item.BotaniaItems;

import java.util.function.Consumer;

import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;

public class ManaCircuitRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        MANAREACTOR.recipeBuilder("soc_mana_electronic_circuit")
                .inputItems(CTNHItems.MANA_ELECTRONIC_CIRCUIT)
                .inputItems(CTNHItems.MANA_SOC, 4)
                .inputItems(CTNHItems.ADVANCED_MANA_CAPACITOR,2)
                .inputItems(CTNHItems.ADVANCED_MANA_INDUCTOR,2)
                .notConsumable(CTNHItems.ELF_CATALYST)
                .inputFluids(CTNHMaterials.Mana, 5000)
                .outputItems(CTNHItems.MANA_ELECTRONIC_CIRCUIT)
                .chancedOutput(CTNHItems.MANA_ELECTRONIC_CIRCUIT.asStack(),8000,2000)
                .chancedOutput(CTNHItems.MANA_ELECTRONIC_CIRCUIT.asStack(),6000,2000)
                .chancedOutput(CTNHItems.MANA_ELECTRONIC_CIRCUIT.asStack(),4000,2000)
                .chancedOutput(CTNHItems.MANA_ELECTRONIC_CIRCUIT.asStack(),2000,2000)
                .chancedOutput(CTNHItems.MANA_ELECTRONIC_CIRCUIT.asStack(),1,2000)
                .EUt(6666)
                .duration(200)
                .save(provider);

        MANAREACTOR.recipeBuilder("soc_mana_integrated_circuit")
                .inputItems(CTNHItems.MANA_INTEGRATED_CIRCUIT)
                .inputItems(CTNHItems.ZENITH_SOC, 4)
                .inputItems(ChemicalHelper.get(TagPrefix.foil, CTNHMaterials.AlfSteel, 16))
                .inputItems(ChemicalHelper.get(TagPrefix.bolt, CTNHMaterials.AlfSteel, 4))
                .inputFluids(CTNHMaterials.Mana, 25600)
                .inputFluids(CTNHMaterials.Zenith_essence, 800)
                .outputItems(CTNHItems.MANA_INTEGRATED_CIRCUIT)
                .chancedOutput(CTNHItems.MANA_INTEGRATED_CIRCUIT.asStack(),4000,3000)
                .chancedOutput(CTNHItems.MANA_INTEGRATED_CIRCUIT.asStack(),2000,3000)
                .chancedOutput(CTNHItems.MANA_INTEGRATED_CIRCUIT.asStack(),1000,4000)
                .EUt(14514)
                .duration(200)
                .save(provider);

        MANAREACTOR.recipeBuilder("mana_circuit_board")
                .inputItems(CTNHItems.STARLIGHT_RUNE)
                .inputItems(ChemicalHelper.get(TagPrefix.foil, CTNHMaterials.ULTRA_MANA, 64))
                .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.ReinforcedEpoxyResin, 32))
                .inputFluids(CTNHMaterials.MANA_STABLE_COOLDOWN, 16000)
                .inputFluids(CTNHMaterials.Zenith_essence, 4000)
                .outputItems(CTNHItems.MANA_CIRCUIT_BOARD, 16)
                .EUt(12222)
                .duration(2000)
                .save(provider);

        GTRecipeTypes.CHEMICAL_RECIPES.recipeBuilder("zenith_soc")
                .inputItems(CTNHItems.MANA_SOC, 2)
                .inputFluids(CTNHMaterials.Zenith_essence, 200)
                .outputItems(CTNHItems.ZENITH_SOC)
                .EUt(6666)
                .duration(400)
                .save(provider);

        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("mana_soc_cutter")
                .inputItems(CTNHItems.MANA_WAFER, 2)
                .inputFluids(CTNHMaterials.Mana, 200)
                .outputItems(CTNHItems.MANA_SOC, 6)
                .EUt(7680)
                .duration(400)
                .save(provider);

        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("zenith_soc_cutter")
                .inputItems(CTNHItems.ZENITH_WAFER)
                .inputFluids(CTNHMaterials.Mana, 1000)
                .outputItems(CTNHItems.ZENITH_SOC, 6)
                .EUt(7680)
                .duration(800)
                .save(provider);

        PHASE_INVERSION.recipeBuilder("mana_soc_inverse")
                .inputItems(CTNHItems.MANA_SOC)
                .inputFluids(CTNHMaterials.Zenith_essence, 400)
                .outputItems(CTNHItems.MANA_WAFER)
                .EUt(480)
                .duration(2000)
                .save(provider);

        PHASE_INVERSION.recipeBuilder("zenith_soc_inverse")
                .inputItems(CTNHItems.ZENITH_SOC)
                .inputItems(GTItems.SYSTEM_ON_CHIP_WAFER)
                .inputFluids(CTNHMaterials.Zenith_essence, 400)
                .outputItems(CTNHItems.ZENITH_WAFER)
                .EUt(480)
                .duration(4000)
                .save(provider);

        HELLFORGE.recipeBuilder("demon")
                .inputItems(GTItems.NANO_COMPUTER_IV)
                .notConsumable(CTNHItems.ENDSLATE)
                .addData("minimumDrain", 2000)
                .addData("drain", 500)
                .outputItems(CTNHItems.WILL_NANO_PROCESSOR_MAINFRAME)
                .EUt(6666)
                .duration(200)
                .save(provider);
    }
}