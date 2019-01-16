package gdx.diablo;

import com.badlogic.gdx.utils.GdxRuntimeException;

public enum CharClass {
  AMAZON     ("am", 0) {{
    name = 4011;
    description = 5128;
  }},
  SORCERESS  ("so", 1) {{
    name = 4010;
    description = 5131;
    fws = bws = nu3s = true;
    blendSpecial = BlendMode.LUMINOSITY;
  }},
  NECROMANCER("ne", 2) {{
    name = 4009;
    description = 5129;
    fws = bws = nu3s = true;
    blendSpecial = BlendMode.LUMINOSITY;
  }},
  PALADIN    ("pa", 3) {{
    name = 4008;
    description = 5132;
    fws = true;
    blendSpecial = BlendMode.ID;
  }},
  BARBARIAN  ("ba", 4) {{
    name = 4007;
    description = 5130;
    fws = true;
    blendSpecial = BlendMode.ID;
  }},
  DRUID      ("dz", 5) {{
    name = 4012;
    description = 22518;
  }},
  ASSASSIN   ("as", 6) {{
    name = 4013;
    description = 22519;
  }},
  ;

  public final String shortName;
  public final int id;
  public int name, description;
  public boolean nu3s = false, fws = false, bws = false;
  public int blendSpecial = BlendMode.NONE;

  CharClass(String shortName, int id) {
    this.shortName = shortName;
    this.id = id;
  }

  public static CharClass get(int classId) {
    switch (classId) {
      case 0:  return AMAZON;
      case 1:  return SORCERESS;
      case 2:  return NECROMANCER;
      case 3:  return PALADIN;
      case 4:  return BARBARIAN;
      case 5:  return DRUID;
      case 6:  return ASSASSIN;
      default: throw new GdxRuntimeException("Invalid class id: " + classId);
    }
  }
}