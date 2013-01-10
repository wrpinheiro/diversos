package meu.projeto.multimodulo.moduloA;

import meu.projeto.multimodulo.moduloA.ModuloAEntry;

import static org.junit.Assert.*;
import org.junit.Test;

public class ModuloAEntryTest {
  @Test
  public void testInstanciaNaoNull() {
    ModuloAEntry instancia = new ModuloAEntry();

    assertNotNull(instancia);
  }
}

