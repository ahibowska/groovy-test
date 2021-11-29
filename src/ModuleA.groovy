class ModuleA {

  def moduleB = new ModuleB()

  public String introduceMyself() {
    return "ModuleA " + moduleB.introduceMyself()
  }
}
