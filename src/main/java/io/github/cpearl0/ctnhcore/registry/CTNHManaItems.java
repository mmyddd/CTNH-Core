package io.github.cpearl0.ctnhcore.registry;

import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.common.item.TooltipBehavior;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import io.github.cpearl0.ctnhcore.common.item.*;
        import io.github.cpearl0.ctnhcore.data.materials.ChemicalItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import tech.vixhentx.mcmod.ctnhlib.langprovider.Lang;
import tech.vixhentx.mcmod.ctnhlib.langprovider.annotation.CN;
import tech.vixhentx.mcmod.ctnhlib.langprovider.annotation.EN;
import tech.vixhentx.mcmod.ctnhlib.langprovider.annotation.Prefix;
import tech.vixhentx.mcmod.ctnhlib.langprovider.annotation.Suffix;
import vazkii.botania.common.lib.BotaniaTags;

import static com.gregtechceu.gtceu.common.data.GTItems.attach;
import static io.github.cpearl0.ctnhcore.registry.CTNHRegistration.REGISTRATE;

@Suffix("tooltip")
public class CTNHManaItems {
    static {
        REGISTRATE.creativeModeTab(() -> CTNHCreativeModeTabs.MANAITEM);
    }
    @CN("§b魔力信息承载基板§r")
    @EN("§bMagic Information Carrier Substrate§r")
    static Lang mana_circuit_board;
    @CN("§b同时蕴含信息和能量§r")
    @EN("§bSimultaneously containing information and energy§r")
    static Lang umlhpic;
    @CN("§b魔力逻辑UV电路板§r")
    @EN("§bMagic Logic UV Circuit Board§r")
    static Lang magic_quantum_processor_mainframe;
    public static void registerItem() {
        MANA_CIRCUIT_BOARD = REGISTRATE
                .item("mana_circuit_board", ComponentItem::create)
                .cnlang("究极魔力电路基板")
                .lang("Mana Circuit Board")
                .onRegister(attach(new TooltipBehavior(text ->
                        text.add(mana_circuit_board.translate())
                )))
                .register();

        UMLHPIC_WAFER = REGISTRATE
                .item("umlhpic_wafer", ComponentItem::create)
                .cnlang("UMLHPIC晶圆")
                .lang("Umlhpic Wafer")
                .onRegister(attach(new TooltipBehavior(text ->
                        text.add(umlhpic.translate())
                )))
                .register();

        UMLHPIC_CHIP = REGISTRATE
                .item("umlhpic_chip", ComponentItem::create)
                .cnlang("UMLHPIC芯片")
                .lang("Umlhpic Chip")
                .onRegister(attach(new TooltipBehavior(text ->
                        text.add(umlhpic.translate())
                )))
                .register();

        MAGIC_QUANTUM_PROCESSOR_MAINFRAME = REGISTRATE
                .item("magic_quantum_processor_mainframe", ComponentItem::create)
                .cnlang("量子纠缠究极魔力主机")
                .lang("Magic Quantum Processor Mainframe")
                .tag(CustomTags.UV_CIRCUITS)
                .onRegister(attach(new TooltipBehavior(text ->
                        text.add(magic_quantum_processor_mainframe.translate())
                )))
                .register();
    }
    public static ItemEntry<ComponentItem> MANA_CIRCUIT_BOARD;
    public static ItemEntry<ComponentItem> UMLHPIC_WAFER;
    public static ItemEntry<ComponentItem> UMLHPIC_CHIP;
    public static ItemEntry<ComponentItem> MAGIC_QUANTUM_PROCESSOR_MAINFRAME;

    public static ItemEntry<ComponentItem> MANA_ELECTRONIC_CIRCUIT = REGISTRATE
            .item("mana_electronic_circuit", ComponentItem::create)
            .cnlang("注魔的电子电路")
            .lang("Mana Electronic Circuit")
            .tag(CustomTags.HV_CIRCUITS)
            .register();

    public static ItemEntry<ComponentItem> MANA_INTEGRATED_CIRCUIT = REGISTRATE
            .item("mana_integrated_circuit", ComponentItem::create)
            .cnlang("注魔的集成电路")
            .lang("Mana Integrated Circuit")
            .tag(CustomTags.EV_CIRCUITS)
            .register();

    public static ItemEntry<ComponentItem> BLOODED_MICRO_PROCESSOR_MAINFRAME = REGISTRATE
            .item("blooded_micro_processor_mainframe", ComponentItem::create)
            .cnlang("血染微型处理器主机")
            .lang("Blooded Micro Processor Mainframe")
            .tag(CustomTags.IV_CIRCUITS)
            .register();

    public static ItemEntry<ComponentItem> WILL_NANO_PROCESSOR_MAINFRAME = REGISTRATE
            .item("will_nano_processor_mainframe", ComponentItem::create)
            .cnlang("恶魔纳米处理器主机")
            .lang("Will Nano Processor Mainframe")
            .tag(CustomTags.LuV_CIRCUITS)
            .register();

    public static ItemEntry<ComponentItem> ELF_CATALYST = REGISTRATE
            .item("elf_catalyst", ComponentItem::create)
            .cnlang("精灵催化剂")
            .lang("Elf Catalyst")
            .register();

    public static ItemEntry<ComponentItem> MANA_SOC = REGISTRATE
            .item("mana_soc", ComponentItem::create)
            .cnlang("§b注魔的SOC")
            .lang("§bMana Soc")
            .register();

    public static ItemEntry<ComponentItem> ZENITH_SOC = REGISTRATE
            .item("zenith_soc", ComponentItem::create)
            .cnlang("§5天顶SOC")
            .lang("§5Zenith Soc")
            .register();

    public static ItemEntry<ComponentItem> MANA_RESISTOR = REGISTRATE
            .item("mana_resistor", ComponentItem::create)
            .cnlang("注魔电阻")
            .lang("Mana Resistor")
            .register();

    public static ItemEntry<ComponentItem> MANA_CAPACITOR = REGISTRATE
            .item("mana_capacitor", ComponentItem::create)
            .cnlang("注魔电容")
            .lang("Mana Capacitor")
            .register();

    public static ItemEntry<ComponentItem> MANA_TRANSISTOR = REGISTRATE
            .item("mana_transistor", ComponentItem::create)
            .cnlang("注魔晶体管")
            .lang("Mana Transistor")
            .register();

    public static ItemEntry<ComponentItem> MANA_DIODE = REGISTRATE
            .item("mana_diode", ComponentItem::create)
            .cnlang("注魔二极管")
            .lang("Mana Diode")
            .register();

    public static ItemEntry<ComponentItem> MANA_INDUCTOR = REGISTRATE
            .item("mana_inductor", ComponentItem::create)
            .cnlang("注魔电感")
            .lang("Mana Inductor")
            .register();

    public static ItemEntry<ComponentItem> ADVANCED_MANA_RESISTOR = REGISTRATE
            .item("advanced_mana_resistor", ComponentItem::create)
            .cnlang("高级注魔电阻")
            .lang("Advanced Mana Resistor")
            .register();

    public static ItemEntry<ComponentItem> ADVANCED_MANA_CAPACITOR = REGISTRATE
            .item("advanced_mana_capacitor", ComponentItem::create)
            .cnlang("高级注魔电容")
            .lang("Advanced Mana Capacitor")
            .register();

    public static ItemEntry<ComponentItem> ADVANCED_MANA_TRANSISTOR = REGISTRATE
            .item("advanced_mana_transistor", ComponentItem::create)
            .cnlang("高级注魔晶体管")
            .lang("Advanced Mana Transistor")
            .register();

    public static ItemEntry<ComponentItem> ADVANCED_MANA_DIODE = REGISTRATE
            .item("advanced_mana_diode", ComponentItem::create)
            .cnlang("高级注魔二极管")
            .lang("Advanced Mana Diode")
            .register();

    public static ItemEntry<ComponentItem> ADVANCED_MANA_INDUCTOR = REGISTRATE
            .item("advanced_mana_inductor", ComponentItem::create)
            .cnlang("高级注魔电感")
            .lang("Advanced Mana Inductor")
            .register();

    public static ItemEntry<ComponentItem> MANA_WAFER = REGISTRATE
            .item("mana_wafer", ComponentItem::create)
            .cnlang("§b注魔的SOC晶圆")
            .lang("§bMana Wafer")
            .register();

    public static ItemEntry<ComponentItem> ZENITH_WAFER = REGISTRATE
            .item("zenith_wafer", ComponentItem::create)
            .cnlang("§5天顶SOC晶圆")
            .lang("§5§bMana Wafer")
            .register();

    public static ItemEntry<ComponentItem> MANA_CPU_WAFER = REGISTRATE
            .item("mana_cpu_wafer", ComponentItem::create)
            .cnlang("魔力CPU晶圆")
            .lang("Mana Cpu Wafer")
            .register();

    public static ItemEntry<ComponentItem> MANA_CPU_CHIP = REGISTRATE
            .item("mana_cpu_chip", ComponentItem::create)
            .cnlang("魔力CPU芯片")
            .lang("Mana Cpu Chip")
            .register();

    public static ItemEntry<ComponentItem> ELEMENTIUM_CPU_WAFER = REGISTRATE
            .item("elementium_cpu_wafer", ComponentItem::create)
            .cnlang("精灵CPU晶圆")
            .lang("Elementium Cpu Wafer")
            .register();

    public static ItemEntry<ComponentItem> ELEMENTIUM_CPU_CHIP = REGISTRATE
            .item("elementium_cpu_chip", ComponentItem::create)
            .cnlang("精灵CPU芯片")
            .lang("Elementium Cpu Chip")
            .register();

    public static ItemEntry<ComponentItem> ENDSLATE = REGISTRATE
            .item("endslate", ComponentItem::create)
            .cnlang("终焉石板")
            .lang("Endslate")
            .register();
    public static void init() {
        registerItem();
        ChemicalItems.init();
    }
}
