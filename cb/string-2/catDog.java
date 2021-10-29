public boolean catDog(String str)
{
  int cats = 0;
  int dogs = 0;
  for (int i = 0; i < str.length() - 2; i++)
  {
    if (str.substring(i, i + 3).equals("cat"))
    {
      cats += 1;
    }
    else if (str.substring(i, i + 3).equals("dog"))
    {
      dogs += 1;
    }
  }
  if (cats == dogs)
  {
    return true;
  }
  else
  {
    return false;
  }
}
