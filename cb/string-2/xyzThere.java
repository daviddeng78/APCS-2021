public boolean xyzThere(String str)
{
  boolean xyz = false;

  if (str.length() < 3)
  {
    xyz = false;
  }

  else if (str.charAt(0) == 'x')
  {
    if (str.substring(0, 3).equals("xyz"))
    {
      xyz = true;
    }
  }

  else
  {
    for (int i = 1; i < str.length() - 2; i++)
    {
      if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.')
      {
        xyz = true;
      }
    }
  }
  return xyz;
}
