package factorioide.factorio;

import factorioide.factorio.mod.Mod;

public class Factorio {
  public Mod core;
  public Mod base;
  
  public Factorio(File) {
    JSONObject json = (JSONObject) (new JSONParser().parse(file));
    this.core = new Mod((JSONObject) json.getValue("core"));
    this.base = new Mod((JSONObject) json.getValue("base"));
  }
}
