/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelMonitoringProto {
  private ModelMonitoringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/model_"
          + "monitoring.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\031google/api/resource.proto\032(go"
          + "ogle/cloud/aiplatform/v1beta1/io.proto\"\354"
          + "\001\n\025ModelMonitoringConfig\022Z\n\021objective_co"
          + "nfigs\030\003 \003(\0132?.google.cloud.aiplatform.v1"
          + "beta1.ModelMonitoringObjectiveConfig\022Q\n\014"
          + "alert_config\030\002 \001(\0132;.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringAlertConfig\022"
          + "$\n\034analysis_instance_schema_uri\030\004 \001(\t\"\252\026"
          + "\n\036ModelMonitoringObjectiveConfig\022i\n\020trai"
          + "ning_dataset\030\001 \001(\0132O.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringObjectiveCon"
          + "fig.TrainingDataset\022\230\001\n)training_predict"
          + "ion_skew_detection_config\030\002 \001(\0132e.google"
          + ".cloud.aiplatform.v1beta1.ModelMonitorin"
          + "gObjectiveConfig.TrainingPredictionSkewD"
          + "etectionConfig\022\211\001\n!prediction_drift_dete"
          + "ction_config\030\003 \001(\0132^.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringObjectiveCon"
          + "fig.PredictionDriftDetectionConfig\022m\n\022ex"
          + "planation_config\030\005 \001(\0132Q.google.cloud.ai"
          + "platform.v1beta1.ModelMonitoringObjectiv"
          + "eConfig.ExplanationConfig\032\352\002\n\017TrainingDa"
          + "taset\0229\n\007dataset\030\003 \001(\tB&\372A#\n!aiplatform."
          + "googleapis.com/DatasetH\000\022@\n\ngcs_source\030\004"
          + " \001(\0132*.google.cloud.aiplatform.v1beta1.G"
          + "csSourceH\000\022J\n\017bigquery_source\030\005 \001(\0132/.go"
          + "ogle.cloud.aiplatform.v1beta1.BigQuerySo"
          + "urceH\000\022\023\n\013data_format\030\002 \001(\t\022\024\n\014target_fi"
          + "eld\030\006 \001(\t\022T\n\031logging_sampling_strategy\030\007"
          + " \001(\01321.google.cloud.aiplatform.v1beta1.S"
          + "amplingStrategyB\r\n\013data_source\032\250\005\n%Train"
          + "ingPredictionSkewDetectionConfig\022\222\001\n\017ske"
          + "w_thresholds\030\001 \003(\0132y.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringObjectiveCon"
          + "fig.TrainingPredictionSkewDetectionConfi"
          + "g.SkewThresholdsEntry\022\265\001\n!attribution_sc"
          + "ore_skew_thresholds\030\002 \003(\0132\211\001.google.clou"
          + "d.aiplatform.v1beta1.ModelMonitoringObje"
          + "ctiveConfig.TrainingPredictionSkewDetect"
          + "ionConfig.AttributionScoreSkewThresholds"
          + "Entry\022P\n\026default_skew_threshold\030\006 \001(\01320."
          + "google.cloud.aiplatform.v1beta1.Threshol"
          + "dConfig\032g\n\023SkewThresholdsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022?\n\005value\030\002 \001(\01320.google.cloud.aiplat"
          + "form.v1beta1.ThresholdConfig:\0028\001\032w\n#Attr"
          + "ibutionScoreSkewThresholdsEntry\022\013\n\003key\030\001"
          + " \001(\t\022?\n\005value\030\002 \001(\01320.google.cloud.aipla"
          + "tform.v1beta1.ThresholdConfig:\0028\001\032\232\005\n\036Pr"
          + "edictionDriftDetectionConfig\022\215\001\n\020drift_t"
          + "hresholds\030\001 \003(\0132s.google.cloud.aiplatfor"
          + "m.v1beta1.ModelMonitoringObjectiveConfig"
          + ".PredictionDriftDetectionConfig.DriftThr"
          + "esholdsEntry\022\260\001\n\"attribution_score_drift"
          + "_thresholds\030\002 \003(\0132\203\001.google.cloud.aiplat"
          + "form.v1beta1.ModelMonitoringObjectiveCon"
          + "fig.PredictionDriftDetectionConfig.Attri"
          + "butionScoreDriftThresholdsEntry\022Q\n\027defau"
          + "lt_drift_threshold\030\005 \001(\01320.google.cloud."
          + "aiplatform.v1beta1.ThresholdConfig\032h\n\024Dr"
          + "iftThresholdsEntry\022\013\n\003key\030\001 \001(\t\022?\n\005value"
          + "\030\002 \001(\01320.google.cloud.aiplatform.v1beta1"
          + ".ThresholdConfig:\0028\001\032x\n$AttributionScore"
          + "DriftThresholdsEntry\022\013\n\003key\030\001 \001(\t\022?\n\005val"
          + "ue\030\002 \001(\01320.google.cloud.aiplatform.v1bet"
          + "a1.ThresholdConfig:\0028\001\032\321\004\n\021ExplanationCo"
          + "nfig\022!\n\031enable_feature_attributes\030\001 \001(\010\022"
          + "\203\001\n\024explanation_baseline\030\002 \001(\0132e.google."
          + "cloud.aiplatform.v1beta1.ModelMonitoring"
          + "ObjectiveConfig.ExplanationConfig.Explan"
          + "ationBaseline\032\222\003\n\023ExplanationBaseline\022>\n"
          + "\003gcs\030\002 \001(\0132/.google.cloud.aiplatform.v1b"
          + "eta1.GcsDestinationH\000\022H\n\010bigquery\030\003 \001(\0132"
          + "4.google.cloud.aiplatform.v1beta1.BigQue"
          + "ryDestinationH\000\022\221\001\n\021prediction_format\030\001 "
          + "\001(\0162v.google.cloud.aiplatform.v1beta1.Mo"
          + "delMonitoringObjectiveConfig.Explanation"
          + "Config.ExplanationBaseline.PredictionFor"
          + "mat\"N\n\020PredictionFormat\022!\n\035PREDICTION_FO"
          + "RMAT_UNSPECIFIED\020\000\022\t\n\005JSONL\020\002\022\014\n\010BIGQUER"
          + "Y\020\003B\r\n\013destination\"\322\001\n\032ModelMonitoringAl"
          + "ertConfig\022j\n\022email_alert_config\030\001 \001(\0132L."
          + "google.cloud.aiplatform.v1beta1.ModelMon"
          + "itoringAlertConfig.EmailAlertConfigH\000\022\026\n"
          + "\016enable_logging\030\002 \001(\010\032\'\n\020EmailAlertConfi"
          + "g\022\023\n\013user_emails\030\001 \003(\tB\007\n\005alert\"/\n\017Thres"
          + "holdConfig\022\017\n\005value\030\001 \001(\001H\000B\013\n\tthreshold"
          + "\"\241\001\n\020SamplingStrategy\022b\n\024random_sample_c"
          + "onfig\030\001 \001(\0132D.google.cloud.aiplatform.v1"
          + "beta1.SamplingStrategy.RandomSampleConfi"
          + "g\032)\n\022RandomSampleConfig\022\023\n\013sample_rate\030\001"
          + " \001(\001B\361\001\n#com.google.cloud.aiplatform.v1b"
          + "eta1B\024ModelMonitoringProtoP\001ZIgoogle.gol"
          + "ang.org/genproto/googleapis/cloud/aiplat"
          + "form/v1beta1;aiplatform\252\002\037Google.Cloud.A"
          + "IPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatf"
          + "orm\\V1beta1\352\002\"Google::Cloud::AIPlatform:"
          + ":V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringConfig_descriptor,
            new java.lang.String[] {
              "ObjectiveConfigs", "AlertConfig", "AnalysisInstanceSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor,
            new java.lang.String[] {
              "TrainingDataset",
              "TrainingPredictionSkewDetectionConfig",
              "PredictionDriftDetectionConfig",
              "ExplanationConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor,
            new java.lang.String[] {
              "Dataset",
              "GcsSource",
              "BigquerySource",
              "DataFormat",
              "TargetField",
              "LoggingSamplingStrategy",
              "DataSource",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor,
            new java.lang.String[] {
              "SkewThresholds", "AttributionScoreSkewThresholds", "DefaultSkewThreshold",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor,
            new java.lang.String[] {
              "DriftThresholds", "AttributionScoreDriftThresholds", "DefaultDriftThreshold",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor,
            new java.lang.String[] {
              "EnableFeatureAttributes", "ExplanationBaseline",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor,
            new java.lang.String[] {
              "Gcs", "Bigquery", "PredictionFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor,
            new java.lang.String[] {
              "EmailAlertConfig", "EnableLogging", "Alert",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor,
            new java.lang.String[] {
              "UserEmails",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor,
            new java.lang.String[] {
              "Value", "Threshold",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor,
            new java.lang.String[] {
              "RandomSampleConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor,
            new java.lang.String[] {
              "SampleRate",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
