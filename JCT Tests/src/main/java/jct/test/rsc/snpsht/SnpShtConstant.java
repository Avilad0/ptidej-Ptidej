/**
 * @author Mathieu Lemoine
 * @created 2009-03-23 (月)
 *
 * Licensed under 3-clause BSD License:
 * Copyright © 2009, Mathieu Lemoine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of Mathieu Lemoine nor the
 *    names of contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY Mathieu Lemoine ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Mathieu Lemoine BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jct.test.rsc.snpsht;

public final class SnpShtConstant {
    public static final String SER_FILE = "jct/test/rsc/snpsht/snpsht.ser"; 
    
	public static final String files[] =
		new String[] {
				"jct/test/rsc/snpsht/parser/package-info.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/IVerFsParser.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/VerFsCommitParser.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/cvsimpl/CvsFsConstraintParser.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/cvsimpl/CvsFsGeneralInfoParser.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/VerFsParserException.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/VerFsFileRevParser.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/VerFsCompleteParser.java",
				"jct/test/rsc/snpsht/parser/verfilesystem/AbstractVerFsParser.java",
				"jct/test/rsc/snpsht/parser/revml/RevMLDocCommonsStrings.java",
				"jct/test/rsc/snpsht/parser/revml/modeler/MovedFilesModeler.java",
				"jct/test/rsc/snpsht/parser/revml/modeler/BranchModeler.java",
				"jct/test/rsc/snpsht/parser/revml/modeler/FilePostProcessing.java",
				"jct/test/rsc/snpsht/parser/revml/modeler/FileGrouper.java",
				"jct/test/rsc/snpsht/parser/revml/RevMLCvsCompleteBuilder.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildRootRepoTimeState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildRootRepoDescrState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildRepoStructScanState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildRootRepoState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildRepoStructEndState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildRepoStructStartState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/structurebuilder/BuildFileRevState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/ErrorStateRevMLState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/CharCodeRevMLState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/AbstractRevMLState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadActionState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/AbstractStringLoaderState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadRevIDState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadTagState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadInfoStartState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadPrevVersionState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadFileNameState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadInfoEndState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadInfoRevisionsScanState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadBranchState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadCommentState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadUpdateTimeState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadAuthorState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadDeltaState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadContentState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/fsm/contentloader/LoadInfoRevFileScanState.java",
				"jct/test/rsc/snpsht/parser/revml/sax/RevMLSaxFsmParser.java",
				"jct/test/rsc/snpsht/parser/revml/sax/RevMLContentSaxParser.java",
				"jct/test/rsc/snpsht/parser/revml/sax/RevMLStructureSaxParser.java",
				"jct/test/rsc/snpsht/parser/sax/DefaultUnknowMakerStateSaxFsm.java",
				"jct/test/rsc/snpsht/parser/sax/AbstractStateSaxFsm.java",
				"jct/test/rsc/snpsht/parser/sax/SaxFsmParseException.java",
				"jct/test/rsc/snpsht/parser/sax/DefaultErrorStateSaxFsm.java",
				"jct/test/rsc/snpsht/parser/sax/SimpleSaxFsmParser.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsActionsIndexSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/cvsimpl/CvsFsGeneralInfoSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/cvsimpl/CvsFsCompleteSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/cvsimpl/CvsFsCommonStrings.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsTagsIndexSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsCommonStrings.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsBranchesIndexSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsFilesIndexSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsCommitsIndexSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsStructureSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/AbstractVerFsSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsValidationDataSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsAuthorsIndexSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/VerFsFileSerializer.java",
				"jct/test/rsc/snpsht/serializer/verfilesystem/IVerFsSerializer.java",
				"jct/test/rsc/snpsht/filesystem/IFsManager.java",
				"jct/test/rsc/snpsht/filesystem/IFsRealEntity.java",
				"jct/test/rsc/snpsht/filesystem/FsFileEntity.java",
				"jct/test/rsc/snpsht/filesystem/IFsNullEntity.java",
				"jct/test/rsc/snpsht/filesystem/IFsFileEntity.java",
				"jct/test/rsc/snpsht/filesystem/FsZipFileManager.java",
				"jct/test/rsc/snpsht/filesystem/FsNullEntity.java",
				"jct/test/rsc/snpsht/filesystem/FsManagerFactory.java",
				"jct/test/rsc/snpsht/filesystem/descriptor/FsTempFileDescriptor.java",
				"jct/test/rsc/snpsht/filesystem/descriptor/FsFileDescriptor.java",
				"jct/test/rsc/snpsht/filesystem/descriptor/IFsDescriptor.java",
				"jct/test/rsc/snpsht/filesystem/descriptor/FsZipEntryDescriptor.java",
				"jct/test/rsc/snpsht/verfilesystem/IVerFsManager.java",
				"jct/test/rsc/snpsht/verfilesystem/IVerFsRootElement.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/ICvsFsCommitConstraint.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/IModeler.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/CvsFsManager.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/groupconstraint/IGroup.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/groupconstraint/SameAuthorConstraint.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/groupconstraint/CommitGroup.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/groupconstraint/IGroupingConstraint.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/groupconstraint/SameCommentConstraint.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/groupconstraint/SlidingWindowConstraint.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/modeler/CommitGrouper.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/visitor/AbstractCvsFsVisitor.java",
				"jct/test/rsc/snpsht/verfilesystem/cvsimpl/visitor/FindOrMakeFileRev.java",
				"jct/test/rsc/snpsht/verfilesystem/comparator/VerFsFileRevUpdateTimeComparator.java",
				"jct/test/rsc/snpsht/verfilesystem/comparator/VerFsCommitStartTimeComparator.java",
				"jct/test/rsc/snpsht/verfilesystem/AbstractVerFsElement.java",
				"jct/test/rsc/snpsht/verfilesystem/VerFsRootRepository.java",
				"jct/test/rsc/snpsht/verfilesystem/package-info.java",
				"jct/test/rsc/snpsht/verfilesystem/VerFsFileRev.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/MainMultiBranchPrioSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/SnapshotDiff.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/SnapshotIterator.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/ISnapshooterListener.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/AbstractMainBranchPrioSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/AbstractSnapshooterExtender.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/MainTrunkSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/DataDiffSnapshooterExtender.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/IMainSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/MainSingleBranchPrioSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/StructureDiffSnapshooterExtender.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/ISnapshooterExtender.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/ISnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/Snapshot.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/PeriodSnapshooterExtender.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/MainSingleBranchSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/SystemState.java",
				"jct/test/rsc/snpsht/verfilesystem/snapshooter/AbstractMainSnapshooter.java",
				"jct/test/rsc/snpsht/verfilesystem/attribute/VerFsUpdateTime.java",
				"jct/test/rsc/snpsht/verfilesystem/attribute/IVerFsTime.java",
				"jct/test/rsc/snpsht/verfilesystem/attribute/VerFsUpdatePeriod.java",
				"jct/test/rsc/snpsht/verfilesystem/attribute/IVerFsPeriod.java",
				"jct/test/rsc/snpsht/verfilesystem/IVerFsSimpleRevision.java",
				"jct/test/rsc/snpsht/verfilesystem/VerFsRepository.java",
				"jct/test/rsc/snpsht/verfilesystem/IVerFsNullRevision.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsAuthor.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsStringFlag.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsFlag.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsFileName.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsCommit.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsCommit.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsComment.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsComment.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsAuthor.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsTag.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsBranch.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsFile.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/AbstractVerFsAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/VerFsCreateAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/VerFsResurrectAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/VerFsEditAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/VerFsBranchAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/VerFsDeleteAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/IVerFsAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/action/VerFsMoveAction.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsTrunk.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsRevID.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/IVerFsFileName.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsFile.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsRevID.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsTag.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/AbstractVerFsFlag.java",
				"jct/test/rsc/snpsht/verfilesystem/flag/VerFsBranch.java",
				"jct/test/rsc/snpsht/verfilesystem/VerFsNullRev.java",
				"jct/test/rsc/snpsht/verfilesystem/visitor/AbstractVerFsVisitor.java",
				"jct/test/rsc/snpsht/verfilesystem/visitor/IVerFsVisitor.java",
				"jct/test/rsc/snpsht/verfilesystem/IVerFsComplexElement.java",
				"jct/test/rsc/snpsht/verfilesystem/IVerFsElement.java",
				"jct/test/rsc/snpsht/verfilesystem/VerFsManager.java",
				"jct/test/rsc/snpsht/utils/diffutils/IFSMDiffUtils.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/unified/UniPatch.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/unified/state/ReadPatchHeaderState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/unified/state/IUniPatchFSMState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/unified/state/PatchLineState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/CopyUnchangedLinesState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/IPatchFSMState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/IPatchErrorState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/PatchStartState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/CopyEndOfFileState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/AbstractPatchFSMState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/state/PatchErrorState.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/IPatch.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/DiffUtilsContext.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/IContextFileReader.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/IContextFileWriter.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/IDiffUtilsContext.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/IContextFileIO.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/ContextFileReader.java",
				"jct/test/rsc/snpsht/utils/diffutils/patch/context/ContextFileWriter.java",
				"jct/test/rsc/snpsht/utils/diffutils/DiffHeader.java",
				"jct/test/rsc/snpsht/utils/diffutils/state/IFSMEndState.java",
				"jct/test/rsc/snpsht/utils/diffutils/state/IFSMState.java",
				"jct/test/rsc/snpsht/utils/diffutils/state/IFSMErrorState.java",
				"jct/test/rsc/snpsht/utils/Pair.java",
				"jct/test/rsc/snpsht/utils/Base64Coder.java",
				"jct/test/rsc/snpsht/utils/cvsutils/CVSRoot.java",
				"jct/test/rsc/snpsht/utils/cvsutils/CVSCheckOut.java",
				"jct/test/rsc/snpsht/utils/cvsutils/CVSRevMLCheckOut.java",
				"jct/test/rsc/snpsht/utils/FSUtils.java" };
}