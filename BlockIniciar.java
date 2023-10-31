public class BlockIniciar {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, zaryaentity.MODID);

    public static final RegistryObject<Block> bloquezarya = register("bloquezarya",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f).strength(5f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    private static <T extends Block> RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        inititems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
