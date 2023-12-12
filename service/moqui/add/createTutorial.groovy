def training = ec.entity.makeValue("moqui.training.entity.MoquiTraining")
training.setFields(context, true,null,null)
 if (!trainingEntity.trainingId) trainingEntity.setSequencedIdPrimary()
training.create()