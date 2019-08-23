

function main() {
  $("#compteEditionInputPseudo").replaceWith(compteEditionInputPseudo())
  $("#compteEditionInputNom").replaceWith(compteEditionInputNom())
  $("#compteEditionInputPrenom").replaceWith(compteEditionInputPrenom())
  $("#compteEditionInputEmail").replaceWith(compteEditionInputEmail())
  $("#compteEditionInputTelephone").replaceWith(compteEditionInputTelephone())
  $("#compteEditionInputRue").replaceWith(compteEditionInputRue())
  $("#compteEditionInputCodePostal").replaceWith(compteEditionInputCodePostal())
  $("#compteEditionInputVille").replaceWith(compteEditionInputVille())
  $("#compteEditionInputMotDePasse").replaceWith(compteEditionInputMotDePasse())
  $("#compteEditionCredit").replaceWith(compteEditionCredit())
}

main()
