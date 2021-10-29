public boolean endOther(String a, String b)
{
  String first = a.toLowerCase();
  String second = b.toLowerCase();
  if (first.length() >= second.length())
  {
    if (first.substring(first.length() - second.length()).equals(second))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  else
  {
    if (second.substring(second.length() - first.length()).equals(first))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
